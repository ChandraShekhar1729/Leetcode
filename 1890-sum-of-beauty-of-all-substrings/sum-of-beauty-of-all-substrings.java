class Solution {
    public static int solve( int arr[]){

       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;

       for( int i=0;i<arr.length;i++){
           if(arr[i]==0){
               continue;
           }

           max=Math.max(max,arr[i]);
           min=Math.min(min,arr[i]);
       }

       return max-min;

    }
    public int beautySum(String s) {
   
   int res=0;


   
        for(int i=0;i<s.length();i++){
            int fr[]=new int[26];
            for(int j=i;j<s.length();j++){
                fr[s.charAt(j)-'a']++;
                res+=solve(fr);
            }
        }
        return res;
        
    }
}