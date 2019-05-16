package other;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 19/5/16 18:31
 */
public class TicketArray {
    public static void main(String[] args) {
        int[] arr = {5,10,10,5,10,5,10,5,5,5,10,10};
        List<Integer> list = reformArray(arr);
        System.out.println(list);
    }
    public static List<Integer> reformArray(int[] arr){
        List<Integer> list = new ArrayList<>();
        if (null==arr)
            return list;
        int flag5=0;
        int flag10=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==5){
                list.add(arr[i]);
                flag5++;
                while (flag5>0&&flag10>0){
                    list.add(10);
                    flag10--;
                    flag5--;
                }
            }else {
                if (flag5>0&&flag10==0){
                    list.add(arr[i]);
                    flag5--;
                }else {
                    flag10++;
                }
            }
        }
        return list;
    }
}
