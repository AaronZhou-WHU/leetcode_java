/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/3 19:44
 */
public class ValidNumber {
    public static void main(String[] args) {
        String s = ".";
        System.out.println(isNumber(s));
    }
    public static boolean isNumber(String s) {
        if (null==s||s.trim().length()==0)
            return false;
        char[] chars = s.trim().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(i==0){
                if ((chars[i]<'0'||chars[i]>'9')&&chars[i]!='-'&&chars[i]!='.'){
                    return false;
                }else if (chars[i]=='-'||chars[i]=='.'){
                    if (i==chars.length-1){
                        return false;
                    }
                    continue;
//                    if (i==chars.length-1||chars[i]<'0'||chars[i]>'9'){
//                        return false;
//                    }
                }
            }else {
                if ((chars[i]<'0'||chars[i]>'9')&&chars[i]!='e'&&chars[i]!='.'){
                    return false;
                }else if (chars[i]=='-'||chars[i]=='.'){
                    if (i==chars.length-1||chars[i]<'0'||chars[i]>'9'){
                        return false;
                    }
                }
            }

        }
        return true;
    }
}
