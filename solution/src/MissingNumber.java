/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/2 19:52
 */
public class MissingNumber {
    public static void main(String[] args) {

    }
    public static int missingNumber(int[] nums) {
        if (null==nums||nums.length==0)
            return 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0&&nums[i]!=i+1){
                int tmp = nums[i];
                nums[i] = nums[tmp-1];
                nums[tmp-1]=tmp;
                i--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1){
                return i+1;
            }
        }
        return 0;
    }
}
