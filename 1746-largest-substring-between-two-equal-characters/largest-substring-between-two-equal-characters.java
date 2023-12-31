class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {

        HashMap<Character, Integer> map= new HashMap<>();

        int max=-1;

        for( int i=0;i<s.length();i++){

         char ch=s.charAt(i);


         if(map.containsKey(ch)){

          max=Math.max(max,(i-map.get(ch)-1));

         }
         else{
             map.put(ch,i);
         }








        }

        return max;
           
    }
}