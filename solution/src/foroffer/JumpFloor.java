package foroffer;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/20 23:47
 */
public class JumpFloor {
    public static void main(String[] args) {

    }
    public int jumpFloor(int target) {
        if(target == 0)
            return 0;
        if(target == 1)
            return 1;
        if(target == 2)
            return 2;
        return jumpFloor(target -1)+jumpFloor(target-2);
    }
}
