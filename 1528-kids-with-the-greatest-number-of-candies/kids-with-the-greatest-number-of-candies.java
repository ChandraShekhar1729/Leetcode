import java.util.ArrayList;
class Solution {
    public boolean large(int[] arr, int n){
        int max=Integer.MIN_VALUE;
        for( int i:arr){
            if(i>=max){
                max=i;
            }
        }
        if(n>=max){
            return true;
        }
      return  false;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

 List<Boolean>list= new ArrayList<>();

   for( int i=0;i<candies.length;i++){
       if(large(candies,candies[i]+extraCandies)==true){
           list.add(true);
       }
       else list.add(false);
   }

return list;
        
    }
}