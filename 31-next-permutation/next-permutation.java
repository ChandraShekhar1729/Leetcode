class Solution {
    public void nextPermutation(int[] nums) {

        int ind=-1;

        for( int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }

            if(ind==-1){
             int start=0;
             int end=nums.length-1;

             while(start<=end){
                 int temp=nums[start];
                 nums[start]=nums[end];

                 nums[end]=temp;
                 start++;
                 end--;
             }

             
             return;

            }


               for( int i=nums.length-1;i>ind;i--){

                         if(nums[i]>nums[ind]){
                             int temp=nums[ind];
                             nums[ind]=nums[i];
                             nums[i]=temp;
                             break;
                         }


               }

               int x=nums.length-1,y=ind+1;

               while(y<=x){
                    int temp=nums[x];
                 nums[x]=nums[y];

                 nums[y]=temp;
                 x--;
                 y++;
               }

       
         }
}