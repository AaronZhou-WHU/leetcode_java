package foroffer;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/21 00:34
 */
public class JumpFloorII {
    public static void main(String[] args) {

    }
    public int JumpFloorII(int target) {
        if(target ==1)
            return 1;
        int count =0;
        for(int i=1;i< target;i++){
            count += JumpFloorII(i);
        }
        return count+1;
    }
}
