class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        boolean occupied[]=new boolean[s.length];
       int count=0;

        for( int i=0;i<g.length;i++){
            

            for(int j=0;j<s.length;j++){
                if(s[j]>=g[i]&&occupied[j]==false){
                    count++;
                    occupied[j]=true;
                    break;
                    
                }
            }
        }


return count;
        
    }
}