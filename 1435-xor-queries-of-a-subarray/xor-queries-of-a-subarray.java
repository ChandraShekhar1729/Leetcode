class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {

        int ans[]=new int[queries.length];
        int k=0;
;
           for( int i=0;i<queries.length;i++){

           int xxx[]=queries[i];

           int xor=0;

           for( int j=xxx[0];j<=xxx[1];j++){
               xor=xor^arr[j];

           }
           ans[k]=xor;
           k++;

           }

           return ans;
        
    }
}