class Solution {
    public int findDays(int[] weights, int cap){

   int days=1;
   int load=0;

int n = weights.length; //size of array.
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > cap) {
                days += 1; //move to next day
                load = weights[i]; //load the weight.
            } else {
                //load the weight on the same day.
                load += weights[i];
            }
        }
        return days;
   




    }
    public int shipWithinDays(int[] weights, int days) {
      int low=Integer.MIN_VALUE;
      int high=0;

      for( int i:weights){
          if(i>low){
              low=i;          }

            high+=i;  
      }

          int ans=-1;

    while (low <= high) {
            int mid = (low + high) / 2;
            int numberOfDays = findDays(weights, mid);
            if (numberOfDays <= days) {
                //eliminate right half
                ans=mid;
                high = mid - 1;
            } else {
                //eliminate left half
                low = mid + 1;
            }
        }
       

       return ans;
        
    }
}