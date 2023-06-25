class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
  boolean b=true;

         for(int i=0;i<arr.length-1;i++){
             int k=Math.abs(arr[0]-arr[1]);

             for(int j=0;j<arr.length-1;j++){
                 if(Math.abs(arr[j]-arr[j+1])==k){

                 }else{
  b=false;
  break;

                 }
             }
         }

         return b;
        
    }
}