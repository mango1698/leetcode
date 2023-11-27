import utils.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shw
 * @date 2023/11/27 20:08
 * @description 环形链表
 */
// TODO
public class Hot141 {

    // 使用Map集合进行求解
    public boolean hasCycle(ListNode head) {
        Map<ListNode,Integer> map = new HashMap<>();
        while(head!=null){
            Integer i = map.get(head);
            if(i!=null && i==1){
                return true;
            }
            map.put(head,1);
            head=head.next;
        }
        return false;
    }
}
