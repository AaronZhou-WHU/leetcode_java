package other;

/**
 * @Author : zhoubin
 * @Description : 正数在坐负数在右
 * @Date : 19/5/16 18:44
 */
public class LeftPositive {
    public static void main(String[] args) {
        int[] a = {1,2,3,-2,-4,5,3,-2,4,1,-5,3};
        dividePositive(a);
        for (int i =0 ;i<a.length;i++) {
            System.out.print(a[i]);
            System.out.print(",");
        }
    }
    public static void dividePositive(int[] arr){
        int positive =0;
        int negetive =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                negetive = i;
                for (positive = negetive+1; positive < arr.length; positive++) {
                    if (arr[positive]>0){
                        int tmp = arr[negetive];
                        arr[negetive] = arr[positive];
                        for (int j = negetive+1; j < positive; j++) {
                            if (arr[j]<0){
                                int ttmp = arr[j];
                                arr[j] = tmp;
                                tmp = ttmp;
                            }
                        }
                        arr[positive] = tmp;
                    }
                }
            }
        }
    }
}
