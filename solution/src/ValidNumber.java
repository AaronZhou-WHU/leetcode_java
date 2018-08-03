/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/3 19:44
 */
public class ValidNumber {
    public static void main(String[] args) {
        String s = "-1.0a";
        System.out.println(isNumber(s));
    }
    public static boolean isNumber(String s) {
        if (null==s||s.length()==0)
            return false;
        char[] chars = s.trim().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(i==0){
                if ((chars[i]<'0'||chars[i]>'9')&&chars[i]!='-'){
                    return false;
                }
            }else {
                if ((chars[i]<'0'||chars[i]>'9')&&chars[i]!='e'&&chars[i]!='.'){
                    return false;
                }
            }

        }
        return true;
    }
}
