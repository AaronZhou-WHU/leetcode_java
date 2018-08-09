package foroffer;

/**
 * @Author : zhoubin
 * @Description : 二维数组中的查找
 * @Date : 18/8/9 17:32
 */
public class FindIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(isIn(arr,7));
    }

    public static boolean isIn(int[][] array, int target) {
        if (null == array)
            return false;
        int m = array[0].length;
        int n = array.length;
        for (int i = 0,j=m-1; i <n&&j>=0 ; ) {
            if (array[i][j]==target){
                return true;
            }else if (array[i][j]>target){
                j--;
            }else {
                i++;
            }
        }
        return false;
    }
}
