                return mid;
            }else if(nums[mid] < target){
                start = mid+1;
            if(nums[mid] == target){

            }else{
                end = mid-1;
            }
        }
        return start;
    }
