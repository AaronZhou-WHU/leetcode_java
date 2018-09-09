package foroffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/9/9 23:16
 */
public class PrintMinNumber {
    public static void main(String[] args) {
        int[] arr = {3,32,321};
        System.out.println(printMinNumber(arr));
    }
    public static String printMinNumber(int[] numbers) {
        if (null==numbers||numbers.length==0)
            return "";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(String.valueOf(numbers[i]));
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String c1 = s1 + s2;
                String c2 = s2 + s1;
                return c1.compareTo(c2);
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (String str:list){
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}
