package foroffer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/10/12 17:13
 */
public class FirstAppearingOnce {
    public static void main(String[] args) {
        String s = "google";
        System.out.println(firstAppearingOnce(s));
    }
    public static char firstAppearingOnce(String string){
        if (string==null||string.length()==0)
            return '#';
        char[] chars = string.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (char ch : chars){
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        for (char ch:chars){
            if (map.get(ch)==1){
                return ch;
            }
        }
        return '#';
    }
}
