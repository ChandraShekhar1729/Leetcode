class Solution {

    public static boolean isPossible(int[] arr, int mid, int m ){
        int sa=1;
        int sum=0;
         for( int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>mid){
                sa++;
                sum=arr[i];
            }
        }

        return sa<=m;

    }
    public int splitArray(int[] nums, int k) {
        int  max=0;
        int sum=0;

       


        for( int i=0;i<nums.length;i++){
                 sum+=nums[i];
                 if(nums[i]>max){
                     max=nums[i];
                 }
           }

           if(nums.length==k){
               return max;
           }

           int lo=max;
           int hi=sum;
           int ans=0;

           while(lo<=hi){
               int mid=lo+(hi-lo)/2;

                if(isPossible(nums,mid,k)==true){
                         ans=mid;
                         hi=mid-1;
                }
                else{
                    lo=mid+1;
                }



 }

 return ans;

        
    }
}