import utils.ListNode;

/**
 * @author shw
 * @date 2023/11/27 20:16
 * @description 合并两个有序列表
 */
public class Hot21 {

    // 时间：击败100% 内存：击败89%
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        while(list1!=null && list2!=null){
            if((list1.val==list2.val) || (list2.val>list1.val && list1.next!=null && list2.val<list1.next.val)){
                ListNode temp2 = list2;
                list2 = list2.next;
                temp2.next = list1.next;
                list1.next = temp2;
            }else if(list2.val>list1.val && list1.next==null){
                break;
            }else{
                list1 = list1.next;
            }
        }
        list1.next = list2;
        return list1;
    }
}
