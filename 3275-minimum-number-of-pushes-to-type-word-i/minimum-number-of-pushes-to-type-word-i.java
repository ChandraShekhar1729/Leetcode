class Solution {
    public int minimumPushes(String word) {

         if(word.length()<=8){
             return word.length();
         }


      int ans=0;
      int val=word.length()/8;
      int rem=word.length()%8;

int i=1;

while(val>0){
    

ans+=8*i;
i++;
val--;
}

if(rem!=0){
    ans+=rem*i;
}


  
   return ans;

    }
}