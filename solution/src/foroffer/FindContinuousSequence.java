package foroffer;

import java.util.ArrayList;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/11/19 17:58
 */
public class FindContinuousSequence {
    public static void main(String[] args) {

    }
    public static ArrayList<ArrayList<Integer>> findContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
        if (sum <= 2) {
            return arrayList;
        }

        int start = 1;
        int end = 2;

        while (start != (sum + 1) / 2) {
            int currentSum = sumOfList(start, end);
            if (currentSum == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    list.add(i);
                }
                arrayList.add(list);
                start++;
                end++;
            } else if (currentSum < sum) {
                end++;
            } else {
                start++;
            }
        }

        return arrayList;
    }

    public static int sumOfList(int start, int end) {        //计算当前序列的和
        int sum = start;
        for (int i = start + 1; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
