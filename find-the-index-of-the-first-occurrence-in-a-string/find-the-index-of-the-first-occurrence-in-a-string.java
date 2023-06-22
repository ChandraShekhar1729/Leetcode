class Solution {
    public int strStr(String haystack, String needle) {
               
            //    if(haystack.length()==needle.length()&&haystack.equals(needle)){
            //        return 0;
            //    }

        for( int i=0;i<=haystack.length()-1;i++){
            for(int j=i+1;j<=haystack.length();j++){
                if(haystack.substring(i,j).equals(needle)){
                    return i;
                }

            }
        }
        return -1;
        
    }
}