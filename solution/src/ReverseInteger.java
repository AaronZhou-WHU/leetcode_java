/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/6 17:43
 */
public class ReverseInteger {
    public static void main(String[] args) {
        int i = -123;
        System.out.println(reverse2(i));
    }

    public static int reverse(int x) {
        String str = String.valueOf(x);
        boolean sign = true;
        if (str.charAt(0) == '-') {
            sign = false;
            str = str.substring(1);
        }
        char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (i == chars.length - 1 && chars[i] == '0') {
                continue;
            }
            stringBuilder.append(chars[i]);
        }
        try {
            return sign ? Integer.parseInt(stringBuilder.toString()) : -Integer.parseInt(stringBuilder.toString());
        } catch (Exception e) {
            return 0;
        }

    }
    public static int reverse2(int x) {
        boolean sign = true;
        if (x<0){
            sign = false;
            x= -x;
        }
        long res =0;
        while (x>0){
            int tmp = x%10;
            x=x/10;
            res =res*10+tmp;
        }
        if (res>Integer.MAX_VALUE){
            return 0;
        }
        return sign?Integer.parseInt(String.valueOf(res)):-Integer.parseInt(String.valueOf(res));

    }
}
