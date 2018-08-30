package foroffer;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/30 22:47
 */
public class AddWithoutPlus {
    public static void main(String[] args) {
        System.out.println(Add(111,899));
        System.out.println(Add(7,15));
    }
    public static int Add(int num1,int num2) {
        if(num1==0)
            return num2;
        if(num2==0)
            return num1;
        while ((num1&num2)!=0){
            int tmp = num1;
            num1 = num1&num2;
            num2 = tmp^num2;
            num1<<=1;
        }
        return num1|num2;
    }
}
