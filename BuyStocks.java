public class BuyStocks {

    public static int buyandSellStocks(int prices[]){
        int buyStok = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i<prices.length; i++){
            if (buyStok<prices[i]) {
                int profit = prices[i]-buyStok;//today's profit
                maxProfit = Math.max(maxProfit, profit);
             } else{
                    buyStok = prices[i];
                }
            }
            return maxProfit;
        }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyandSellStocks(prices));
    }
}
