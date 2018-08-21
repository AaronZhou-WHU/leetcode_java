package foroffer;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/22 01:11
 */
public class Multiply {
    public static void main(String[] args) {

    }
    public int[] multiply(int[] A) {
        if(null==A||A.length==0){
            return A;
        }
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int tmp = 1;
            for (int j = 0; j < A.length; j++) {
                if (j==i)
                    continue;
                tmp*=A[j];
            }
            B[i] = tmp;
        }
        return B;
    }
}
