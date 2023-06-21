class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str ="";

        int i=0;
        int j=0;

        while(i<word1.length()&&j<word2.length()){
          char ch1=word1.charAt(i);
          str+=ch1;
          char ch2= word2.charAt(j);
          str+=ch2;
          i++;
          j++;




        }

        if(i<word1.length()){
            String str1=word1.substring(i);
            str+=str1;
            
                    }

                    if(j<word2.length()){
                        String str1=word2.substring(j);
                        str+=str1;
                    }

                    return str;
        
    }
}