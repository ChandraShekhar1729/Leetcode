class Solution {

    public int countPrimes(int n) {

        int arr[]=new int[n];


        for( int i=2;i<=Math.sqrt(n);i++){

            if(arr[i]==0){
               

         for( int j=i*i;j<n;j=j+i){
                   

           arr[j]=1;
}


       }
   }
    int count=0;
   for( int k=2;k<n;k++){
       if(arr[k]==0){
           count++;
       }
   }
   return count;
        
     }
}