class Solution {
    public int maxDepth(String s) {
        int upcount=0;
        int downcount=0;
        int ans=0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                upcount++;
            }
            ans=Math.max(ans,upcount);
            if(s.charAt(i)==')'){
                upcount--;
            }

        }
        return ans;
        
    }
}