class Solution {
    public int maxScore(String s) {


      int max=Integer.MIN_VALUE;
      
      for(int i=0;i<s.length()-1;i++){

           int countOfZeroInLeft=0;
          int countOfOneInRight=0;

          
          String leftString=s.substring(0,i+1);

          String rightString=s.substring(i+1);

         

          for( int j=0;j<leftString.length();j++){
              if(leftString.charAt(j)=='0'){
                  countOfZeroInLeft++;
              }
          }


          for(int k=0;k<rightString.length();k++){
              if(rightString.charAt(k)=='1'){
                  countOfOneInRight++;
              }
          }


          int ans=countOfZeroInLeft+countOfOneInRight;

          if(ans>max){
              max=ans;
          }





      }

     return max;



        
    }
}