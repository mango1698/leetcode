import utils.ListNode;

/**
 * @author shw
 * @date 2023/11/24 20:58
 * @description 相交链表
 */
// TODO 优化
public class Hot160 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    /***
     * @author shw
     * @date 2023/11/25 09:45
     * @return utils.ListNode
     * 遍历链表 暴力求解
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headB;
        while (headA.next!=null){
            headB = temp;
            while(headB.next!=null){
                if (headA==headB){
                    return headA;
                }
                headB = headB.next;
            }
            headA = headA.next;
        }
        return null;
    }

    public static void main(String[] args) {

        ListNode c1 = new ListNode(8);
        ListNode c2 = new ListNode(4);
        ListNode c3 = new ListNode(5);

        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(1);

        a1.next = a2;
        a2.next = c1;
        c1.next = c2;
        c2.next = c3;

        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(1);
        b1.next = b2;
        b2.next = b3;
        b3.next = c1;

        ListNode intersectionNode = getIntersectionNode(a1, b1);
        System.out.println(intersectionNode);
    }
}
