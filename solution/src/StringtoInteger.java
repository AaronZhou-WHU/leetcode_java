/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/5 23:44
 */
public class StringtoInteger {
    public static void main(String[] args) {

    }
    public static int myAtoi(String str) {
        if (null==str||str.trim().length()==0)
            return 0;
        str = str.trim();
        StringBuffer res = new StringBuffer();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i==0&&chars[i]=='-'){
                res.append(chars[i]);
            }
            if (chars[i]>='0'||chars[i]<='9'){
                res.append(chars[i]);
            }else {
                break;
            }
        }
        if (res.length()==0){
            return 0;
        }else if (res.length()==1&&res.equals("-")){
            return 0;
        }else {
            return Integer.parseInt(res.toString());
        }
    }
}
