package foroffer;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/9/11 01:35
 */
public class Permutation {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3};
        permute(array,0);
    }
    public static ArrayList<String> permutation(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (null==str||str.length()==0)
            return arrayList;
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            
        }
        return arrayList;
    }
    public static void permute(int[] array,int start){
        if(start==array.length){  // 输出
            System.out.println(Arrays.toString(array));
        }
        else
            for(int i=start;i<array.length;++i){
                swap(array,start,i);  //  交换元素
                permute(array,start+1);  //交换后，再进行全排列算法
                swap(array,start,i);  //还原成原来的数组，便于下一次的全排列
            }
    }

    private static void swap(int[] array,int s,int i){
        int t=array[s];
        array[s]=array[i];
        array[i]=t;
    }

}
