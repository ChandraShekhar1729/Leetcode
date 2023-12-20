class Solution {
    public int buyChoco(int[] prices, int money) {


    int minPrice=Integer.MAX_VALUE;

    for(int i=0;i<prices.length-1;i++){
        for( int j=i+1;j<prices.length;j++){
            if(minPrice>(prices[i]+prices[j])){
                minPrice=prices[i]+prices[j];
            }
        }
    }


      if(minPrice>money){
          return money;
      }

    return money-minPrice;



        
    }
}