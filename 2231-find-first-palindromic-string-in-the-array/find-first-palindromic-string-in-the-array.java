class Solution {
    
    public boolean isPalindromeOrNot(String str){
        
        boolean ans=true;
        
        int start=0, end=str.length()-1;
        
        
        while(start<=end){
            
            if(str.charAt(start)!=str.charAt(end)){
                ans=false;
                break;
            }
            
            start++;
            end--;
            
        }
        
        return ans;
        
        
        
    }
    public String firstPalindrome(String[] words) {
        
        
        for( int i=0;i<words.length;i++){
            
            String str=words[i];
            if(isPalindromeOrNot(str)==true){
                
                return str;
            }
        }
        
        
        return "";
        
        
        
        
        
    }
}