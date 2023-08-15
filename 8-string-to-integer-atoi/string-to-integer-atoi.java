class Solution {
    public int myAtoi(String s) {
        long num=0;
        char[] chars=s.toCharArray();

        if(chars.length==0){
            return 0;
                  }

    int i=0,sign=1;
    char current=chars[i];

    while(current==' '){
    i++;
    if(i==chars.length)return 0;
    current=chars[i];
        
    }

   
      if(current=='-'){
          if(i+1<chars.length&&chars[i+1]=='+')return 0;
        sign=-1;
        i++;
    }

    if(current=='+'){
if(i+1<chars.length&&chars[i+1]=='-')return 0;
   i++;
    }
   
   

    for(;i<chars.length;i++){
    
    current=chars[i];
    if(current==' '||current=='.')break;
    if(current<'0'||current>'9'){
        break;
        
    }
    else{
     num=num*10+current-'0';

       if(sign*num<Integer.MIN_VALUE){
           return Integer.MIN_VALUE;
       }
       if(sign*num>Integer.MAX_VALUE){
           return Integer.MAX_VALUE;
       }


    }






    }

    num=sign*num;

    return (int) num;


    }






}
