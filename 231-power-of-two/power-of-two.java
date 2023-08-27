class Solution {
    public boolean isPowerOfTwo(int n) {
        int count=0;

        while(n>0){
            int x=~n+1;
            x=n&x;
            n=n-x;
            count++;
        }

        return count==1;
        
    }
}