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
        int[] dp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            dp[i] =0;
        }
        dp[0]=array[0];
        int max = dp[0];
        for (int i = 1; i < array.length; i++) {
            dp[i]=getMax(dp[i-1]+array[i],array[i]);
            if (dp[i]>max){
                max=dp[i];
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
