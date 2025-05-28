public class BuyAndSellStock {
    public static int buyAndSell(int prices[]){
        int buyPrice = Integer.MAX_VALUE;  // 7 , 1 ....
        int maxProfit = 0;

        for(int i = 0 ; i < prices.length; i++ ){
            if(buyPrice < prices[i]){ // 1 ) ( 7 < 7 ) false // 2) (7 < 1 ) // 3) (1 < 5 )
                int profit = prices[i] - buyPrice; //todays profit  2) profit =  5 - 1 = 4 ..... 
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i]; // 1)buyPrice = 7 // 2)BuyPrice = 1 // 
            }
        }

        return  maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7 , 1, 5 , 3 , 6 , 4};
        int result = buyAndSell(prices);
        System.out.println(result);
    }
}
