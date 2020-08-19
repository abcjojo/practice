package ţ�ͽ�ָoffer�����.ţ�ͽ�ָoffer�����;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-10-15 20:43
 **/
public class �������һ���� {
    public ListNode EntryNodeOfLoop(ListNode pHead) {

        if(pHead==null|| pHead.next==null|| pHead.next.next==null)return null;

        ListNode fast = pHead;
        ListNode slow = pHead;

        while (fast!=slow) {
            if (fast.next != null && fast.next.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }else{
                return null;
            }
        }

        slow = pHead;

        while (slow!=fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }
}
