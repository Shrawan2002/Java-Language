public class Modify_BuyAndSell_Stocks {
    public static int[] buyandSellStocks(int prices[]){
        int buyStock =  Integer.MAX_VALUE;
        int maxProfit = 0;
        int buyDay = 0;
        int sellDay = 0;
        for(int i=0; i<prices.length; i++){
            if (buyStock<prices[i]) {
                int profit = prices[i]-buyStock;
                if (profit>maxProfit) {
                    maxProfit = profit;
                    buyDay = i;// Store the day we sell to maximize profit
                }
            }else{
                buyStock = prices[i];
                sellDay = i;// Store the day we buy at the lowest price
            }
        }
        return new int[]{buyDay,sellDay,maxProfit};
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int result[] = buyandSellStocks(prices);
        System.out.println("Buy on day " + result[0] + ", sell on day " + result[1] + ", max profit: " + result[2]);
    }
}
    
