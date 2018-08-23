package foroffer;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/23 08:46
 */
public class DeleteDuplication {
    public static void main(String[] args) {

    }
    public ListNode deleteDuplication(ListNode head)
    {
        if(null==head||head.next==null)
            return head;
        ListNode cur =head;
        ListNode next = cur.next;
        ListNode pre = null;
        while(cur!=null||null!=next){
            if(next!=null&&cur.val==next.val){
                while(next!=null&&cur.val==next.val){
                    next=next.next;
                }
            }else{
                if(null==pre){
                    pre=cur;
                    head =pre;
                }else {
                    pre.next=cur;
                    pre =pre.next;
                }
            }
            cur = next;
            if(next!=null){
                next=next.next;
            }
        }
        if(null==pre){
            head = pre;
        }else{
            pre.next=cur;
        }
        return head;
    }
}
