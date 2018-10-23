package foroffer;

import com.sun.org.apache.xml.internal.utils.Hashtree2Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/10/23 23:36
 */
public class FindNumsAppearOnce {
    public static void main(String[] args) {

    }
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (null!=array&&array.length>=2){
            Map<Integer,Integer> map = new HashMap<>();
            for(int a : array){
                if (map.containsKey(a)){
                    map.put(a,map.get(a)+1);
                }else {
                    map.put(a,1);
                }
            }
            List<Integer> list = new ArrayList<>(2);
            for (int key:map.keySet()){
                if (map.get(key)==1){
                    list.add(key);
                }
            }
            num1[0] = list.get(0);
            num2[0] = list.get(1);
        }
    }
}
