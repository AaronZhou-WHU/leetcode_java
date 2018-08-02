import java.util.ArrayList;
import java.util.List;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/2 18:15
 */
public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> list = findDuplicates(arr);
        for (Integer integer :list){
            System.out.println(integer);
        }
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (null==nums||nums.length==0)
            return list;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=nums[nums[i]-1]){
                int tmp = nums[i];
                nums[i] = nums[tmp-1];
                nums[tmp-1] = tmp;
                i--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1){
                list.add(nums[i]);
            }
        }
        return list;
    }
}
