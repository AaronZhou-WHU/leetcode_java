package leetcode;

import java.util.*;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 19/4/25 11:26
 */
public class T122BestTimetoBuyandSellStockII {
    public static void main(String[] args) {
        int[] arr = {2,1,2,1,0,0,1};
        //int[] arr = {2, 2, 5};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        if (null == prices || prices.length < 2)
            return 0;
        int buyPrice = 0;
        int sellPrice = 0;
        int profit = 0;
        List<Integer> minList = new ArrayList<>();
        List<Integer> maxList = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            if (i == 0) {
                if (prices[i + 1] >= prices[i]) {
                    minList.add(prices[i]);
                } else if (prices[i + 1] < prices[i]) {
                    //maxList.add(prices[i]);
                }
            } else if (i == prices.length - 1) {
                if (prices[i - 1] > prices[i]) {
                    //minList.add(prices[i]);
                } else if (prices[i - 1] <= prices[i]) {
                    maxList.add(prices[i]);
                }
            } else {
                if (prices[i - 1] > prices[i] && prices[i + 1] >= prices[i]) {
                    minList.add(prices[i]);
                } else if (prices[i - 1] <= prices[i] && prices[i + 1] < prices[i]) {
                    maxList.add(prices[i]);
                }
            }
        }
        for (int k=0;k<minList.size();k++){
            buyPrice = minList.get(k);
            if (k<maxList.size()){
                sellPrice = maxList.get(k);
                profit += sellPrice - buyPrice;
            }
        }
        System.out.println("min:" + minList);
        System.out.println("max:" + maxList);
        return profit;
    }
}
