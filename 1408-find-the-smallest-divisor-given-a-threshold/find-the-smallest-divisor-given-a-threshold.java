class Solution {

    public static boolean isPossible(int[] nums,int div, int threshold){
        int res=0;

        for( int i=0;i<nums.length;i++){
            res+=(int)Math.ceil(nums[i]*1.0/div);
        }

        return res<=threshold;

    }
    public int smallestDivisor(int[] nums, int threshold) {
     int max=nums[0];

     for(int i=1;i<nums.length;i++){
         max=Math.max(max,nums[i]);

     }
     if(threshold==nums.length){
         return max;
     }

     int lo=1;
     int hi=max;

     int mdiv=Integer.MIN_VALUE;

     while(lo<=hi){
         int div=lo+(hi-lo)/2;

         if(isPossible(nums,div,threshold)==true){

            mdiv=div;
            hi=div-1;
}else{
    lo=div+1;
}


         
    }
return mdiv;

    }
}