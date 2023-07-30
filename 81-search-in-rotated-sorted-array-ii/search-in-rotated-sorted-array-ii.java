class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            //to avoid duplicates
            while(start<end && nums[start]==nums[start+1]){
                start++;
            }
        while(start<end && nums[end]==nums[end-1]){
                end--;
            }
            int mid = start+ (end - start) / 2;
            if (nums[mid] == target)
                return true;
        
            if (nums[start] <= nums[mid]){
                 if (target < nums[mid] && target >= nums[start]) 
                    end = mid - 1;
                 else
                    start = mid + 1;
            } 
        
            if (nums[mid] <= nums[end]){
                if (target > nums[mid] && target <= nums[end])
                    start = mid + 1;
                 else
                    end = mid - 1;
            }
        }
        return false;
    }
        
    }
