package foroffer;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/27 11:30
 */
public class DoublePower {
    public static void main(String[] args) {
        System.out.println(Power(2,3));

    }

    public static double Power(double base, int exponent) {
        if(base==0)
            return base;
        if(exponent==0)
            return 1.0;
        String s = String.valueOf(base);
        System.out.println(s);
        if (s.contains(".")){
            s="2.0";
            String[] substring = s.split(".");
            System.out.println(substring.length);
//            int n = substring[1].length();
//            String s_base = substring[0] + substring[1];
//            int i_base = Integer.parseInt(s_base);
//            int res = 1;
//            for (int i = 0; i < exponent; i++) {
//                res *= i_base;
//            }
//            String res_string = String.valueOf(res);
//            String s1 = res_string.substring(0, res_string.length() - n) + "." + res_string.substring(res_string.length() - n);
//            return Double.parseDouble(s1);
        }else {
            int i_base = Integer.parseInt(s);
            int res = 1;
            for (int i = 0; i < exponent; i++) {
                res *= i_base;
            }
            return Double.parseDouble(String.valueOf(res));
        }
        return base;

    }
}
