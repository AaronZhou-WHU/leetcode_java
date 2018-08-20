package foroffer;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/21 00:59
 */
public class Sum_Solution {
    public static void main(String[] args) {

    }
    public int Sum_Solution(int n) {
        if(n==1)
            return 1;
        return Sum_Solution(n-1)+n;
    }
}
