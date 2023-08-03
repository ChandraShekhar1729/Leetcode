class Solution {
 public static boolean isPresentOrNot( int[] arr, int x){
        boolean ans=false;

        for( int i=0;i<arr.length;i++){

            if(arr[i]==x){
                ans=true;
                break;
            }
        }
           return ans;
        

    }


    public int findKthPositive(int[] vec, int k) {
    //     int n=arr.length;
    //     int left=0;
    //     int right=n-1;
    //     int missing=compute(arr[n-1],n);

    //     while(left<=right){
    //         int mid=left+(right-left)/2;
    //         missing=compute(arr[mid],mid+1);
    //         if(missing>=k)right=mid-1;
    //         else left=mid+1;
    //     }
    //     if(right==-1) return k;
    //     return arr[right]+k-compute(arr[right],right+1);

        
        
    // }

    // int compute(int actual,int expected){
    //     return actual-expected;
     int x=1;

        
        for( int i=1;;i++){

       if(isPresentOrNot(vec,i)==false){

           if(x==k){
               return i;
           }else{
               x++;
           }
               
}
             


            
        }


    }
}