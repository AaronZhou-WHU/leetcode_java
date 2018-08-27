package foroffer;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/27 23:51
 */
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(null==head||k<0){
            return head;
        }
        ListNode cur = head;
        int count = 0;
        while(null!=cur){
            cur = cur.next;
            count++;
            if(count==k){
                //head = head.next;
            }
        }
        if(count<k){
            return null;
        }
        int a = count -k;
        while(a!=0){
            head = head.next;
            a--;
        }
        return head;

    }
}
