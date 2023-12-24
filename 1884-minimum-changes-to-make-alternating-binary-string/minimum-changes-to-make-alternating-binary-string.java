class Solution {
    public int minOperations(String s) {


        int start_with_0=0;//01010101...

        for(int i=0;i<s.length();i++){

          if(i%2==0){

        if(s.charAt(i)=='1'){
            start_with_0++;
        }

          }
          else{
              
           if(s.charAt(i)=='0'){
               start_with_0++;
           }


          }
}
int start_with_1=s.length()-start_with_0;
return Math.min(start_with_0,start_with_1);

        
    }
}