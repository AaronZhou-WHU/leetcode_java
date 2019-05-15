package other;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : zhoubin
 * @Description : 全排列--分治
 * @Date : 19/5/9 09:36
 */
public class QuanPaiLie {
    public static void main(String[] args) {
        //QPL2(0,"","123");
        List<String> qpl = QPL("123");
        for (String str :qpl){
            System.out.println(str);
        }

    }
    //递归解法1
    public static List<String> QPL(String str){
        List<String> list = new ArrayList<>();
        if (str.length()==1) {
            list.add(str);
            return list;
        }else {
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                String leftStr = str.substring(0,i)+str.substring(i+1);
                String prefixStr = String.valueOf(str.charAt(i));
                System.out.println("prefixStr:"+prefixStr);
                System.out.println("leftStr:"+leftStr);
                List<String> qpl = QPL(leftStr);
                for (String str1 :qpl){
                    list.add(prefixStr+str1);
                }
            }
        }
        return list;

    }
    //递归解法2
    public static void QPL2(int num,String prefix,String left){
        if (num==3) {
            System.out.println(prefix);
        }else {
            char[] chars = left.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                String tmpStr = left.substring(0,i)+left.substring(i+1);
                QPL2(3-tmpStr.length(), prefix+String.valueOf(chars[i]),tmpStr);

            }
        }


    }
}
