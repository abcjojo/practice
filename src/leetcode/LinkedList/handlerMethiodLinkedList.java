//package leetcode.LinkedList;
//
///**
// * @program: exercise
// * @description:   P235������Ĳ����ķ���
// * @author: Jojo.Lee
// * @create: 2019-08-10 21:09
// **/
//public class handlerMethiodLinkedList {
//
//    //ɾ�������е��ظ�����
//    /**
//    * @Description:   ���������˫�ر�������ѭ��������������ѭ����currentNode��ʼ������
//     * ����data��ͬʱɾ��
//    * @Param:
//    * @return:
//    * @Author: Jojo.Lee
//    * @Date:
//    */
//    public void deleteDuplecate(Node head){
//        Node currentNode = head;
//        while (currentNode!=null) {
//            Node nextNode = currentNode.next;
//            while(nextNode!=null){
//                if(currentNode.data==nextNode.data){
//                    nextNode = nextNode.next;
//                }
//                nextNode = nextNode.next;
//            }
//            currentNode = currentNode.next;
//        }
//    }
//
//    /**
//    * @Description: �ҳ������еĵ�����k��Ԫ��     ˼�룺����ָ�룬��һ��ָ������k-1����Ȼ������ָ��һ���ߣ���ǰ���ָ���ߵ�����
//     * ĩβʱ�򣬺����ָ������λ�þ��ǵ�����k��Ԫ��
//    * @Param:  k
//    * @return:  Node node
//    * @Author: Jojo.Lee
//    * @Date:
//    */
//    public Node findKElem(Node head,  int k){
//        //�ж�k�ĺ�����
//        if (k<1) return null;
//        Node preNode = head;
//        Node currentNode = head;
//        for (int i=0; i<k-1; i++){
//            preNode = preNode.next;
//        }
//        //�����Ȳ���k��k���Ϸ�
//        if(preNode == null)
//            return null;
//        while(preNode != null){
//            preNode = preNode.next;
//            currentNode = currentNode.next;
//        }
//        return currentNode;
//    }
//    /**
//    * @Description: Ѱ��������м�ڵ�   ˼�룺 ����ָ�뷨����ָ��ÿ������������ָ��ÿ����һ����������Ϊ����ʱ����ָ�뵱ǰλ�þ���
//     * �м�ڵ㣬ż��ʱ����ָ�뵱ǰ�ڵ㼰��һ�ڵ�Ϊ�м�ڵ�
//    * @Param:
//    * @return:
//    * @Author: Jojo.Lee
//    * @Date:
//    */
//    public Node sercherMidNode(Node head){
//        Node fast = head;
//        Node slow = head;
//        while(fast!=null && fast.next!=null && fast.next.next!=null){
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        return slow;
//    }
//
//    /**
//    * @Description: ʵ������ķ�ת
//    */
//    public Node reverseLinked(Node head){
//        //�������Ϊ�ջ���ֻ��һ���ڵ㣬����ͷ���
//        if(head==null && head.next==null) return head;
//        //��ǰ�ڵ����һ���ڵ� ,�������淴ת�������ͷ
//        Node preNode = null;
//        //��ǰ�ڵ�
//        Node curNode = head;
//        //��ǰ�ڵ����һ�ڵ�
//        Node nextNode =null;
//
//        while(curNode!=null){
//            nextNode = curNode.next;
//            curNode.next = preNode;
//            preNode = curNode;
//            curNode = nextNode;
//        }
//        return preNode;
//    }
//
//    /**
//    * @Description: ��β��ͷ���������   �ݹ鷨
//    * @Param:
//    * @return:
//    * @Author: Jojo.Lee
//    * @Date:
//    */
//    public void printListReversely(Node head){
//        Node node = head;
//        if(node.next != null){
//            node = node.next;
//            printListReversely(node);
//        }
//        System.out.println(node.data);
//    }
//    //�ȷ�ת������˳�����
//    public void printListReversely2(Node head){
//        if(head==null){
//            return;
//        }
//        Node preNode = null;
//        Node curNode = head;
//        Node nextNode = null;
//
//        while (curNode!=null){
//            nextNode = curNode.next;
//            curNode.next = preNode;
//            preNode = curNode;
//            curNode = nextNode;
//        }
//        while(preNode!=null){
//            System.out.println(preNode.data);
//            preNode = preNode.next;
//        }
//    }
//
//}
