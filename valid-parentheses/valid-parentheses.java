import java.util.Stack;
class Solution {
    public boolean isValid(String expression) {

        Stack<Character> st= new Stack<>();


         for(int i=0;i<expression.length();i++){

             char ch= expression.charAt(i);
               if(ch=='('||ch=='{'||ch=='['){
                   st.push(ch);
               }

               else if(ch==')'){
                     if(st.size()==0){
                         return false;
                     } else if(st.peek()!='('){
                         return false;
                     }
                     else{
                         st.pop();
                     }


               }

               else if(ch=='}'){
 if(st.size()==0){
                         return false;
                     } else if(st.peek()!='{'){
                         return false;
                     }
                     else{
                         st.pop();
                     
                     }


               }

               else if(ch==']'){

 if(st.size()==0){
                         return false;
                     } else if(st.peek()!='['){
                         return false;
                     }
                     else{
                         st.pop();
                     }



               }
         }

        if(st.size()==0){
            return true;
        }


        return false;
        
    }
}