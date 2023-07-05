import java.util.ArrayList;
class Solution {
    public int removeDuplicates(int[] A) {
       
        // int i=0;
        // int n=nums.length-1;
        // int j=0;
        // while(j<=n){

        //    if(nums[i]==nums[j]){
               
        //        j++;
        // }else{
        //     i++;
        // nums[i]=nums[j];
        //   j++;

        //    }

        // }
        // return i+1;
                ArrayList<Integer> list= new ArrayList<>();
        list.add(A[0]);
        for( int i=1;i<A.length;i++){
            if(A[i]!=A[i-1]){
                list.add(A[i]);
            }
            
        }
        int x=list.size();
         int z=0;
        for(int k:list){
            A[z]=k;
            z++;
        }
        
        return x;
        
    }
}