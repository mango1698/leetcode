import utils.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shw
 * @date 2023/11/28 09:02
 * @description
 */

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
// TODO 优化
public class Hot142 {
    public ListNode detectCycle(ListNode head) {
        Map<ListNode,Integer> map = new HashMap<>();
        int j = 0;
        while(head!=null){
            Integer i = map.get(head);
            if(i!=null){
                return head;
            }
            map.put(head,j);
            j++;
            head=head.next;
        }
        return null;
    }
}
