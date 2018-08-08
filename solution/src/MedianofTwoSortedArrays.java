/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/8 15:32
 */
public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length != 0) {
            if (nums2.length % 2 == 0) {
                int lenght = nums2.length;
                double d = nums2[lenght / 2] + nums2[lenght / 2 - 1];
                return d / 2;
            } else {
                int lenght = nums2.length;
                double d = nums2[lenght / 2];
                return d;
            }
        } else if (nums1.length != 0 && nums2.length == 0) {
            if (nums1.length % 2 == 0) {
                int lenght = nums1.length;
                double d = nums1[lenght / 2] + nums1[lenght / 2 - 1];
                return d / 2;
            } else {
                int lenght = nums1.length;
                double d = nums1[lenght / 2];
                return d;
            }
        } else if (nums1.length != 0 && nums2.length != 0) {
            int length = nums1.length + nums2.length;
            if (length % 2 != 0) {
                int count = 0;
                for (int i = 0, j = 0; i < nums1.length || j < nums2.length; ) {
                    if (i < nums1.length && j < nums2.length) {
                        if (nums1[i] > nums2[j]) {

                            if (count == length / 2) {
                                return nums2[j];
                            }
                            j++;
                            count++;
                        } else {

                            if (count == length / 2) {
                                return nums1[i];
                            }
                            i++;
                            count++;
                        }
                    } else if (i >= nums1.length && j < nums2.length) {
                        if (count != length / 2) {
                            j++;
                            count++;
                        } else {
                            return nums2[j];
                        }
                    } else if (i < nums1.length && j >= nums2.length) {
                        if (count != length / 2) {
                            i++;
                            count++;
                        } else {
                            return nums1[i];
                        }
                    }
                }
            } else {
                int count = 0;
                int first = 0;
                int second = 0;
                for (int i = 0, j = 0; i < nums1.length || j < nums2.length; ) {
                    if (i < nums1.length && j < nums2.length) {
                        if (nums1[i] > nums2[j]) {

                            if (count == length / 2 - 1) {
                                first = nums2[j];
                            } else if (count == length / 2) {
                                second = nums2[j];
                            }
                            j++;
                            count++;
                        } else {

                            if (count == length / 2 - 1) {
                                first = nums1[i];
                            } else if (count == length / 2) {
                                second = nums1[i];
                            }
                            i++;
                            count++;
                        }
                    } else if (i >= nums1.length && j < nums2.length) {

                        if (count == length / 2 - 1) {
                            first = nums2[j];
                        } else if (count == length / 2) {
                            second = nums2[j];
                        }
                        j++;
                        count++;
                    } else if (i < nums1.length && j >= nums2.length) {

                        if (count == length / 2 - 1) {
                            first = nums1[i];
                        } else if (count == length / 2) {
                            second = nums1[i];
                        }
                        i++;
                        count++;
                    }
                }
                double d = first + second;
                return d / 2;
            }
        }
        return 0;
    }
}
