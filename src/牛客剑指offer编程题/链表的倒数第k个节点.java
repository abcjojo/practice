package ţ�ͽ�ָoffer�����;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-25 10:57
 **/

public class ����ĵ�����k���ڵ� {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (k<1) return null;
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k - 1 && fast != null; i++){
            fast = fast.next;
        }
        if (fast == null) {
            return null;
        }

        while (fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
