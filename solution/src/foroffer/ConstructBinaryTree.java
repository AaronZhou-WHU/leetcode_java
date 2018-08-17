package foroffer;

import java.util.Arrays;

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
        if (pre.length==0){
            return root;
        }
        root.val=pre[0];
        int index = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i]==pre[0]){
                index = i;
                break;
            }
        }
        int[] leftIn = Arrays.copyOfRange(in,0,index);
        int[] rightIn = Arrays.copyOfRange(in,index+1,in.length);
        int[] leftPre = Arrays.copyOfRange(pre,1,index+1);
        int[] rightPre = Arrays.copyOfRange(pre,index+1,pre.length);
        if (leftPre.length>0){
            root.left=reConstructBinaryTree(leftPre,leftIn);
        }
        if (rightPre.length>0){
            root.right=reConstructBinaryTree(rightPre,rightIn);
        }

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
