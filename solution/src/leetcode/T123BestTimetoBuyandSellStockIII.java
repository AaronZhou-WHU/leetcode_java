package leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 19/4/25 14:49
 */
public class T123BestTimetoBuyandSellStockIII {
    public static void main(String[] args) {
        int[] arr = {1,2,4,2,5,7,2,4,9,0};
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
        int transationTimes = 0;
        List<Integer> list = new ArrayList<>();
        for (int k=0;k<minList.size();k++){
            buyPrice = minList.get(k);
            sellPrice = maxList.get(k);
            //profit += sellPrice - buyPrice;
            list.add(sellPrice - buyPrice);
//            if (k<maxList.size()){
//                sellPrice = maxList.get(k);
//                profit += sellPrice - buyPrice;
//                list.add(sellPrice - buyPrice);
//            }
        }
        if (list.size()<=2){
            for (int m : list){
                profit+=m;
            }
        }else {
            Collections.sort(list, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
            for (int index =0;index<2;index++){
                profit+=list.get(index);
            }
        }
        System.out.println("min:" + minList);
        System.out.println("max:" + maxList);
        System.out.println("list:" + list);
        return profit;
    }
}
