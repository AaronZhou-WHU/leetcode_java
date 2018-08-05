/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/5 23:44
 */
public class StringtoInteger {
    public static void main(String[] args) {
        String s = "-";
        //String s = "-2147483648";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String str) {
        if (null==str||str.trim().length()==0)
            return 0;
        str = str.trim();
        StringBuffer res = new StringBuffer();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='-'&&i==0){
                res.append(chars[i]);
            }else if (chars[i]>='0'&&chars[i]<='9'){
                res.append(chars[i]);
            }else {
                break;
            }
        }
        if (res.length()==0){
            return 0;
        }else if (res.toString().equals("-")&&res.length()==1){
            return 0;
        }else {
            try {
                return Integer.parseInt(res.toString());
            }catch (Exception e){
                int si = Integer.MIN_VALUE;
                return -si;
            }
        }
    }
}
