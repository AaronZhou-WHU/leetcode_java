package foroffer;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/20 23:50
 */
public class Fibonacci {
    public static void main(String[] args) {

    }
    public int Fibonacci(int n) {
        if(n ==0)
            return 0;
        if(n==1)
            return 1;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
