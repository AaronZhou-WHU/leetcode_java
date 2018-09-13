package foroffer;

import java.util.*;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/9/14 00:02
 */
public class FirstNotRepeatingChar {
    public static void main(String[] args) {
        System.out.println(firstNotRepeatingChar("NXWtnzyoHoBhUJaPauJaAitLWNMlkKwDYbbigdMMaYfkVPhGZcrEwp"));
    }
    public static int firstNotRepeatingChar(String str) {
        if(null==str)
            return -1;
        Map<Character,Integer> map = new LinkedHashMap<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])){
                map.put(chars[i],map.get(chars[i])+1);
            }else {
                map.put(chars[i],1);
            }

        }
        char tmp = 0;
        for(Character ch:map.keySet()){
            if (map.get(ch)==1){
                tmp = ch;
                break;
            }
                
        }
        for (int i = 0; i < chars.length; i++) {
            if (tmp == chars[i]){
                return i;
            }
        }
        return -1;


    }
    public int FirstNotRepeatingChar2(String str) {
        if(str == null || str.length()==0) return -1;
        List<Character> list = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!list.contains(ch)){
                list.add(Character.valueOf(ch));
            }else{
                list.remove(Character.valueOf(ch));
            }
        }
        if(list.size() <=0) return -1;
        return str.indexOf(list.get(0));
    }
}
