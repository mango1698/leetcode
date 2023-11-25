import utils.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shw
 * @date 2023/11/25 12:51
 * @description 回文链表
 */
public class Hot234 {

    /***
     * @author shw
     * @date 2023/11/25 13:10
     * @return boolean 先将列表放入一个集合中，从头和尾部同时遍历匹配
     */
    public boolean isPalindrome(ListNode head) {
        List<Integer> stack = new ArrayList<>();
        while(head!=null){
            stack.add(head.val);
            head = head.next;
        }
        int start = 0;
        int end = stack.size()-1;
        while(start<end){
            if (stack.get(start)==stack.get(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
