class Solution {
    public static int largest( int[] arr){

        int x=Integer.MIN_VALUE;
        int y=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                x=arr[i];
                y=i;

            }
        }

        return y;
    }
    public int dominantIndex(int[] nums) {

         int ans=-1;
         int maxIndex=largest(nums);
         boolean bool=true;

         for( int i=0;i<nums.length;i++){

                if(i!=maxIndex){
                    if(nums[i]*2<=nums[maxIndex]){

                    }
                    else{
                        bool=false;
                        break;
                    }
                } 


         }

         if(bool==true){
             return maxIndex;
         }

         return -1;
        
    }
}