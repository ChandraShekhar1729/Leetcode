import java.util.*;
class Solution {
   
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // by using binary search to find the x in the array;
        int lo=0;
         int hi=arr.length-1;
         int mid=0;
         while(lo<=hi){

            mid=(lo+hi)/2;

            if(arr[mid]==x){
                break;
            }
            else if(arr[mid]<x){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }


         }

ArrayList<Integer> list= new ArrayList<>();

     if(k==1){
     
           int temp=Math.abs(arr[0]-x);
           int pos=0;

     for( int i=1;i<arr.length;i++){


           if(Math.abs(arr[i]-x)<temp){
               temp=Math.abs(arr[i]-x);
               pos=i;
           }

     }
     
     list.add(arr[pos]);
     return  list;



     }


         int l=mid-1;
          int r=mid;


         while(l>=0&&r<arr.length&&k>0){
          
          if(Math.abs(x-arr[l])<=Math.abs(x-arr[r])){
              list.add(arr[l]);
              l--;
              
          }
          else{
     list.add(arr[r]);
     r++;

          }

      k--;



         }
        
           
         while(k>0&&l>=0){
            
           list.add(arr[l]);
             l--;
              k--;



         }

         while(k>0&&r<arr.length){
            
              list.add(arr[r]);
              r++;
              k--;

         }



     Collections.sort(list); 

     return list;
    }
}