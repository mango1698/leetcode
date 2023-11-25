import utils.ListNode;

/**
 * @author shw
 * @date 2023/11/25 09:46
 * @description 反转链表
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Hot206 {
    public ListNode reverseList(ListNode head) {
        ListNode h = head;
        if (h!=null){
            ListNode temp1 = h.next;
            while(h!=null){
                if (temp1!=null){
                    ListNode temp2 = temp1.next;
                    temp1.next = h;
                    h = temp1;
                    temp1 = temp2;
                }else {
                    head.next = null;
                    return h;
                }
            }
        }
        return null;
    }
}
