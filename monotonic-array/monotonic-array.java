class Solution {
    public static boolean isInc(int[] arr){
        boolean b=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){

            }else{
             return false;
            }
           
    }
    return b;
    }
        public static boolean isDec(int[] arr){
        boolean b=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]){

            }else{
             return false;
            }
           
        }
         return true;
    }
    public boolean isMonotonic(int[] nums) {
      if(isInc(nums)||isDec(nums)){
          return true;
      }
      return false;
        
    }
}