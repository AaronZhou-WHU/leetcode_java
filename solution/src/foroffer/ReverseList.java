package foroffer;

import java.util.ArrayList;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/14 17:44
 */
public class ReverseList {
    public static void main(String[] args) {
        ListNode listNode = null;
        System.out.println(printListFromTailToHead(listNode));
                
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (null==listNode) {
            
        } else {
            list.addAll(printListFromTailToHead(listNode.next));
            list.add(listNode.val);
        }

        return list;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

