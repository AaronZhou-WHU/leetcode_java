package foroffer;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/22 00:35
 */
public class isDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,1,3,0,4};
        int[] dd =  {2,4,3,1,4};
        System.out.println(duplicate(arr,5,dd));
    }
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null||numbers.length==0||length==0)
            return false;

        int j =0;
        for (int i = 0; i < length; i++) {
            if (numbers[i]==i)
                continue;
            else if (numbers[i]!=i){
                int tmp = numbers[i];
                numbers[i] = numbers[tmp];
                numbers[tmp] = tmp;
            }
            if (numbers[i]!=i&&numbers[i]==numbers[numbers[i]]){
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
}
