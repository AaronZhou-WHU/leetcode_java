package foroffer;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/27 22:49
 */
public class NumberOf1 {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(numberOf1_1(a));
        System.out.println(numberOf1_2(a));
        System.out.println(numberOf1_3(a));
    }
    public static int numberOf1_1(int n) {
        int count =0;
        while(n!=0){
            if ((n&1)==1){
                count++;
            }
            n>>>=1;
        }
        return count;
    }
    public static int numberOf1_2(int n) {
        int count =0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
    public static int numberOf1_3(int n) {
        int count =0;
        while(n!=0){
            n-=n&(~n+1);
            count++;
        }
        return count;
    }
}
