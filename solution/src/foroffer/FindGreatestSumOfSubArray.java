package foroffer;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/30 23:25
 */
public class FindGreatestSumOfSubArray {
    public static void main(String[] args) {
        int[] arr = {6,-3,-2,7,-15,1,2,2};
        System.out.println(findGreatestSumOfSubArray(arr));
    }
    public static int findGreatestSumOfSubArray(int[] array) {
        if (null==array||array.length==0)
            return 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i]=getMax(array[i-1]+array[i],array[i]);
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    private static int getMax(int i, int j) {
        if (i>j)
            return i;
        return j;
    }
}
