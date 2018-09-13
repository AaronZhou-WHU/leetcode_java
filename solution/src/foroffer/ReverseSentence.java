package foroffer;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/9/14 01:02
 */
public class ReverseSentence {
    public String reverseSentence(String str) {
        if (null==str||str.length()==0)
            return str;
        String[] strings = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length-1; i >=0; i--) {
            sb.append(strings[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
