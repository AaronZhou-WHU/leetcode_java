package foroffer;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/22 00:30
 */
public class StrToInt {
    public static void main(String[] args) {

    }
    public int strToInt(String str) {
        if(null==str||str.length()==0)
            return 0;
        char[] chars = str.toCharArray();
        if(str.length()==1){
            if(chars[0]<'0'||chars[0]>'9'){
                return 0;
            }else {
                return chars[0]-'0';
            }
        }else {
            boolean negetive = false;
            int result =0;
            for(int i=0 ;i<str.length();i++){
                if(i==0&&chars[i]=='-'){
                    negetive = true;
                    continue;
                }else if(i==0&&chars[i]=='+'){
                    continue;
                }
                if(chars[i]<'0'||chars[i]>'9'){
                    return 0;
                }else {
                    result = chars[i]-'0'+result*10;
                }
            }
            if (negetive)
                return -result;
            else
                return result;
        }
    }
}
