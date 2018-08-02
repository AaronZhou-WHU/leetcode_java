/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/2 19:00
 */
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {-1,4,2,1,9,10};
        System.out.println(firstMissingPositive1(arr));
    }
    //时间复杂度o(n),空间复杂度比较小
    private static int firstMissingPositive1(int[] nums) {
        if (null==nums||nums.length==0)
            return 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0&&nums[i]<nums.length&&nums[i]!=nums[nums[i]-1]){
                int tmp = nums[i];
                nums[i] = nums[tmp-1];
                nums[tmp-1] = tmp;
                i--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length;
    }

    //时间复杂度o(n),空间复杂度比较大
    public static int firstMissingPositive2(int[] nums) {
        if (null==nums||nums.length==0)
            return 1;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>max){
                max = nums[i];
            }
        }
        int[] newNums = new int[max+1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0){
                newNums[0]=nums[i];
            }else {
                newNums[nums[i]]=nums[i];
            }
        }
        for (int i = 1; i < max+1; i++) {
           if (newNums[i]!=i){
               return i;
           }
        }
        return max+1;
    }
}
