package foroffer;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/14 18:48
 */
public class ConstructBinaryTree {
    public static void main(String[] args) {

    }

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode root = new TreeNode(0);
        root.val= pre[0];
        int index = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i]==root.val){
                index = i;
            }
        }
        int[] left = in.
        return root;
    }
}

//  Definition for binary tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
