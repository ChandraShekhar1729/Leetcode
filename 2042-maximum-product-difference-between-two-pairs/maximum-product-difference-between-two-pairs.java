class Solution {
public int[] twoMin(int[] nums){
   int min=Integer.MAX_VALUE;
    int secMin=0;
    int i=0;
    for( ;i<nums.length;i++){
        if(nums[i]<=min){
          secMin=min;
          min=nums[i];
        }
        else if (nums[i] <= secMin && nums[i]!=min) {
              secMin = nums[i];
            }
      

    }

    
return new int[] {min,secMin};


}

public int[] twoMax(int[] nums){
    int max=Integer.MIN_VALUE;
    int secMax=0;
   int i=0;
    for( ;i<nums.length;i++){
        if(nums[i]>=max){
          secMax=max;
          max=nums[i];
        }
        else if (nums[i] > secMax && nums[i] != max) {
               secMax = nums[i];
            }
       
    }
    

return new int[]{max,secMax};


}


    public int maxProductDifference(int[] nums) {

     int[] max=twoMax(nums);
     int Mprod=max[0]*max[1];


     int[] min=twoMin(nums);
     int MinProd=min[0]*min[1];


     return (Mprod-MinProd);
        
        
    }
}