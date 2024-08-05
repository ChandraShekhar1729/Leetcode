public class Solution {
    public string GetEncryptedString(string s, int k) {
        
        if(s.Length==1){
           return s; 
        }
        
        StringBuilder ans= new StringBuilder();
        
        for( int i=0;i<s.Length;i++){
           int index=i+k; 
            if(index>(s.Length-1)){
                index=(index%(s.Length));
            }
            
        ans.Append(s[index]); 
               
        }
        
        return ans.ToString();
        
    }
}