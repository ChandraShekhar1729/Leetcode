class Solution {
    public static int GCD( int x, int y){
        int gdc=1;

        for( int i=2;i<=Math.min(x,y);i++){
            if(x%i==0&&y%i==0){
                gdc=i;
            }
        }

        return gdc;
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }

        int len1=str1.length();
        int len2=str2.length();
         
      
int gcd=GCD(len1,len2);

return str1.substring(0,gcd);
        
    }
}