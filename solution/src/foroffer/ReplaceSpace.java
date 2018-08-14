package foroffer;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/14 17:35
 */
public class ReplaceSpace {
    public static void main(String[] args) {

    }
    public static String replaceSpace(StringBuffer str) {
        if(null==str||str.length()==0){
            return str.toString();
        }

        char[] chars = str.toString().toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i =0 ;i <chars.length;i++){
            if(chars[i]==' '){
                sb.append("%20");
            }
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
