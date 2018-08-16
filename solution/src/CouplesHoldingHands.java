/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/4 23:23
 */
public class CouplesHoldingHands {
    public static void main(String[] args) {
        int[] row = {0, 2, 1, 3};
        //int[] row = {3, 2, 0, 1};

        System.out.println(minSwapsCouples(row));
    }
    public static int minSwapsCouples(int[] row) {
        if (null==row||row.length==0)
            return 0;
        int count =0;
        for (int i = 0; i < row.length-2; i+=2) {
            for (int j = i+1; j < row.length; j++) {
                if (row[i]%2==0){
                    if (row[j]==row[i]+1&&j!=i+1){
                        int tmp = row[j];
                        row[j]=row[i+1];
                        row[i+1]=tmp;
                        count++;
                        break;
                    }
                }else if (row[i]%2!=0){
                    if (row[j]==row[i]-1&&j!=i+1){
                        int tmp = row[j];
                        row[j]=row[i+1];
                        row[i+1]=tmp;
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
}
