class Solution {
    public boolean check(int[] nums) {

        int count=0;
        int n=nums.length;

        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
                count++;
            }
        }

        if(nums[n-1]>nums[0])count++;
        if(count==0){
            return true;
        }

        return count==1?true:false;
        
    }
}