import java.util.ArrayList;
import java.util.*;
class Solution {
    public int[] findPeakGrid(int[][] mat) {

        ArrayList<Integer>list= new ArrayList<>();

        for( int i=0;i<mat.length;i++){
            for( int j=0;j<mat[0].length;j++){
                int val=mat[i][j];
                list.add(val);

            }
        }
        Collections.sort(list);


        int val=list.get(list.size()-1);
        int arr[]= new int[2];


        for( int i=0;i<mat.length;i++){
            for( int j=0;j<mat[0].length;j++){
                if(mat[i][j]==val){
          arr[0]=i;
          arr[1]=j;
          break;
                }

            }
            
        }

        return arr;
        
    }
}