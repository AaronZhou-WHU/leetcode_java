/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/7 16:25
 */
public class IntegertoRoman {

    public static void main(String[] args) {
        int i = 58;
        System.out.println(intToRoman(i));
    }
    public static String intToRoman(int num) {
        String[] symbols = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        if (num<1)
            return null;
        String res="";
        while (num>0){
            for (int i = values.length-1; i >=0 ; ) {
                if (num>=values[i]){
                    num =num-values[i];
                    res += symbols[i];
                }else {
                    i--;
                }
            }
        }
        return res;
    }
}
