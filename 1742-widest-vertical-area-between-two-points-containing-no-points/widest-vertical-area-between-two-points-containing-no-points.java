class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[][] temp= null;
      // temp= Arrays.sort(points, Comparator.comparingInt(points -> points[0]));

      Arrays.sort(points, (a, b) -> a[0] - b[0]);


       int ans=Integer.MIN_VALUE;

       for(int i=0;i<points.length-1;i++){
           if(Math.abs(points[i][0]-points[i+1][0])>ans){
                    ans=Math.abs(points[i][0]-points[i+1][0]);
           }
       }

       return ans;
    }
}