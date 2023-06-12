//{ Driver Code Starts
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int[] ans = new Solution().kLargest(arr, n, k);
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        int i=0;
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for( ;i<k;i++){
            pq.add(arr[i]);
        }
        
        for(int j=i;j<arr.length;j++){
            if(arr[j]>pq.peek()){
                pq.poll();
                pq.add(arr[j]);
            }
        }
        
        int arrr[]= new int[k];
        int x=0;
        while(pq.size()>0){
           arrr[x]=pq.poll();
           x++;
          
          
        }
         Arrays.sort(arrr);
         int start=0,end=arrr.length-1;
         while(start<=end){
             int temp=arrr[start];
             arrr[start]=arrr[end];
             arrr[end]=temp;
             start++;
             end--;
         }
        return arrr;
       
        
    }
}