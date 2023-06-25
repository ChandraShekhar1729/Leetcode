class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;


String m=s.trim();
for( int i=m.length()-1;i>=0;i--){
    if(m.charAt(i)!=' '){
     
        count++;
    }else{
        break;
    }
}
       
 return count;     
    }
}