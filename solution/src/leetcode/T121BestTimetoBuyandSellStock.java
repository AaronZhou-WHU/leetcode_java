package leetcode;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 19/4/24 17:50
 */
public class T121BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(maxProfit(arr));
    }
//[3,2,6,5,0,3]

    public static int maxProfit(int[] prices) {
        if (null==prices||prices.length<2)
            return 0;
        int buyPrice = prices[0];
        int sellPrice = prices[1];
        int buyDay = 0;
        int sellDay = 1;
        int profit =sellPrice - buyPrice;
        for (int i =1;i<prices.length-1;i++){
            if (prices[i]<buyPrice){
                buyPrice = prices[i];
                buyDay = i;
                sellPrice = buyPrice;
            }
            if (prices[i+1]>sellPrice){
                sellPrice = prices[i+1];
                sellDay = i+1;
            }
            profit = sellPrice - buyPrice>profit?sellPrice - buyPrice:profit;
        }
        return profit>0?profit:0;
    }
}
