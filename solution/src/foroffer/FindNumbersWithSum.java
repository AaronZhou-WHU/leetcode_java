package foroffer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/11/30 16:26
 */
public class FindNumbersWithSum {

    public ArrayList<Integer> findNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if (null == array || array.length < 2)
            return list;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > (sum / 2))
                break;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    if (list.size() == 2) {
                        int tmp = array[i] * array[j];
                        if (tmp < list.get(0) * list.get(1)) {
                            list.clear();
                            list.add(array[i]);
                            list.add(array[j]);
                        }
                    } else {
                        list.add(array[i]);
                        list.add(array[j]);
                    }
                    break;
                }
            }
        }
        return list;
    }
}
