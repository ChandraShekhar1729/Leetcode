class Solution {
    public void moveZeroes(int[] nums) {
        int insertposition=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            nums[insertposition]=nums[i];
            insertposition++;
            }
        }
        while(insertposition<nums.length){
            nums[insertposition]=0;
            insertposition++;
        }
        
    }
}