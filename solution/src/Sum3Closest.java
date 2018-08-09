/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/8 17:50
 */
public class Sum3Closest {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 7, 2};
        qucikSort(arr, 0, arr.length - 1);
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static int threeSumClosest(int[] nums, int target) {
        qucikSort(nums, 0, nums.length - 1);
        //for ()

        return target;
    }

    public static void qucikSort(int[] nums, int begin, int end) {
        if (begin > end) {
            return;
        } else {
            int index = begin;
            int left = begin;
            int right = end;
            while (left < right) {
                while (nums[right] > nums[index]) {
                    right--;
                    if (right == left) {
                        break;
                    }
                }
                if (nums[right] < nums[index]) {
                    int tmp = nums[right];
                    nums[right] = nums[index];
                    nums[index] = tmp;
                    index = right;

                }
                while (nums[left] < nums[index]) {
                    left++;
                    if (left == right) {
                        break;
                    }
                }
                if (nums[left] > nums[index]) {
                    int tmp = nums[left];
                    nums[left] = nums[index];
                    nums[index] = tmp;
                    index = left;

                }
            }
            qucikSort(nums, begin, left - 1);
            qucikSort(nums, right + 1, end);

        }
    }
}
