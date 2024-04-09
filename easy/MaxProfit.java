public class MaxProfit {

  public static void main(String[] args) {
    int[] prices = {7, 1, 5, 3, 6, 4};

    System.out.println("maxProfit : " + maxProfit(prices));
  }

  public static int maxProfit(int[] prices) {
    int maxProfit = 0;
    int minPrice = prices[0];
    for (int i = 1; i < prices.length; i++) {
      if (maxProfit < prices[i] - minPrice) {
        maxProfit = prices[i] - minPrice;
      }
      if (minPrice > prices[i]) {
        minPrice = prices[i];
      }
    }
    return maxProfit;
  }

}
