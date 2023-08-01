class Solution {
    public boolean bouquet(int[] arr, int m, int n, int mid){
                   int count=0;
               int    noOfb=0;
              for( int i:arr){
                  if(i<=mid)count++;
                  else{
                     noOfb+=count/n;
                     count=0;
                  }
              }

            noOfb+=count/n;

              return noOfb>=m;



}
    public int minDays(int[] bloomDay, int m, int k) {
    long x=    (long)  m*k;
        if(x>bloomDay.length)return -1;
         
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;

            for( int i:bloomDay){
                if(i>max){
                    max=i;
                }
                if(i<min){
                    min=i;
                }
            }

            int low=min;
            int high=max;

            while(low<=high){


                int mid=(low+high)/2;

                if(bouquet(bloomDay,m,k,mid)==true) { high=mid-1;
       }         else{
                    low=mid+1;
                }

            }

return  low;

    }
}