import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 19/1/10 20:11
 */
public class BestTimetoBuyandSellStockIII123 {
    public static void main(String[] args) {
        int[] arr = {6,1,3,2,4,7};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        if (null==prices||prices.length<2)
            return 0;
        int buyDay =0;
        int sellDay = buyDay+1;
        List<Integer> list = new ArrayList<>();
        int tmpMax = 0;
        int profitTmp =0;
        while(buyDay<prices.length&&sellDay<prices.length){
            if (prices[sellDay]>=prices[buyDay]){
                tmpMax = tmpMax > prices[sellDay]?tmpMax:prices[sellDay];
                sellDay++;
                if (sellDay>=prices.length){
                    profitTmp = tmpMax - prices[buyDay];
                    list.add(profitTmp);
                    System.out.println(profitTmp);
                    break;
                }
            }else {
                if (tmpMax<=prices[buyDay]){
                    buyDay = sellDay;
                    sellDay = buyDay +1;
                }else {
                    profitTmp = tmpMax - prices[buyDay];
                    buyDay = sellDay;
                    sellDay = buyDay +1;
                    list.add(profitTmp);
                    System.out.println(profitTmp);
                    tmpMax =0;

                }
            }
        }
        Collections.sort(list);
        int i =0;
        int result = 0;
        for (Integer value:list){
            result+=value;
            i++;
            if (i>=2){
                break;
            }
        }
        return result;
    }
}
