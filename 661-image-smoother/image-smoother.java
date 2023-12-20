class Solution {
public int getSmoothedValue( int[][] img, int row, int col){
      int sum=0;
      int count=0;
       for( int i=row-1;i<=row+1;i++){
           for(int j=col-1;j<=col+1;j++){
               if(isValidCell(img,i,j)){
                   sum+=img[i][j];
                   count++;
               }
           }
       }

       return (int)Math.floor(sum/count);
}


public boolean isValidCell(int[][] img, int row, int col){
    return (row>=0&&row<img.length&&col>=0&&col<img[0].length);
}


    public int[][] imageSmoother(int[][] img) {
      

      int rows=img.length;
      int cols=img[0].length;


      int[][] result= new int[rows][cols];

      for( int i=0;i<rows;i++){
          for( int j=0;j<cols;j++){
              result[i][j]=getSmoothedValue(img,i,j);
          }
      }
       

return result;

        
    }
}