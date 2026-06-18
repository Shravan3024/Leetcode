# Find First and Last Position of Element in Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 
Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:
Input: nums = [], target = 0
Output: [-1,-1]

 
Constraints:


	0 <= nums.length <= 105
	-109 <= nums[i] <= 109
	nums is a non-decreasing array.
	-109 <= target <= 109

## Solution

**Language:** Java  
**Runtime:** 12 ms (beats 0.88%)  
**Memory:** 48 MB (beats 69.89%)  
**Submitted:** 2026-06-18T17:47:48.568Z  

```java
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int n=nums.length;

        Map<Integer, List<Integer>> mp= new HashMap<>();

        int ans[]= new int[2];

        Arrays.fill(ans, -1);

        //if(n==1) return new int[]{0,0};
        if(n==0) return ans;

        for(int i=0; i<n; i++)
        {
            if(!mp.containsKey(nums[i]))
            {
                mp.put(nums[i], new ArrayList<Integer>());
            }

            List<Integer> samp=mp.get(nums[i]);
            samp.add(i);

            mp.put(nums[i], samp);
        }

        if(!mp.containsKey(target))
        {
            return ans;
        }

        List<Integer> demo=mp.get(target);

        if(demo.size()==1)
        {
            ans[0]=demo.get(0);
            ans[1]=demo.get(0);
        }
        else if(demo.size()>1)
        {
            ans[0]=demo.get(0);
            ans[1]=demo.get(demo.size()-1);
        }

        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)