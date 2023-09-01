class Solution {
    public static int count( int n){

        int count=0;
        while(n!=0){
            int digit=n&1;

            if(digit==1){
                count++;
            }
            n=n>>1;

        }
        return count;
    }
    public int[] countBits(int n) {
        int arr[]= new int[n+1];
        int k=0;
        for( int i=0;i<=n;i++){
            int val=count(i);
            arr[k]=val;
            k++;

        }
        return arr;
    }
}