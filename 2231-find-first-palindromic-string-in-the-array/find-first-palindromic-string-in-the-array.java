class Solution {
    public static boolean isBoolean(String str){
         int i=0;int j=str.length()-1;

         while(i<=j){
             if(str.charAt(i)==str.charAt(j)){
                 i++;
                 j--;
             }
             else{
                 return false;
             }
         }

         return true;
    }
    public String firstPalindrome(String[] words) {
        for( int i=0;i<words.length;i++){
            String str=words[i];
            boolean ans=isBoolean(str);
            if(ans==true){
                return words[i];
            }
        }
        return "";
        
    }
}