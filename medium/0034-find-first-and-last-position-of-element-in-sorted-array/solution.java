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