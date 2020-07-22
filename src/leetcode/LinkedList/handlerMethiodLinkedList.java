//package leetcode.LinkedList;
//
///**
// * @program: exercise
// * @description:   P235对链表的操作的方法
// * @author: Jojo.Lee
// * @create: 2019-08-10 21:09
// **/
//public class handlerMethiodLinkedList {
//
//    //删除链表中的重复数据
//    /**
//    * @Description:   对链表进行双重遍历，外循环正常遍历，内循环从currentNode开始遍历，
//     * 遇到data相同时删除
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
//    * @Description: 找出链表中的倒数第k个元素     思想：两个指针，第一个指针先走k-1步，然后两个指针一起走，当前面的指针走到链表
//     * 末尾时候，后面的指针所在位置就是倒数第k个元素
//    * @Param:  k
//    * @return:  Node node
//    * @Author: Jojo.Lee
//    * @Date:
//    */
//    public Node findKElem(Node head,  int k){
//        //判断k的合理性
//        if (k<1) return null;
//        Node preNode = head;
//        Node currentNode = head;
//        for (int i=0; i<k-1; i++){
//            preNode = preNode.next;
//        }
//        //链表长度不足k，k不合法
//        if(preNode == null)
//            return null;
//        while(preNode != null){
//            preNode = preNode.next;
//            currentNode = currentNode.next;
//        }
//        return currentNode;
//    }
//    /**
//    * @Description: 寻找链表的中间节点   思想： 快慢指针法，快指针每次走两步，慢指针每次走一步。链表长度为奇数时，快指针当前位置就是
//     * 中间节点，偶数时，慢指针当前节点及下一节点为中间节点
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
//    * @Description: 实现链表的反转
//    */
//    public Node reverseLinked(Node head){
//        //如果链表为空或者只有一个节点，返回头结点
//        if(head==null && head.next==null) return head;
//        //当前节点的上一个节点 ,用来保存反转后的链表头
//        Node preNode = null;
//        //当前节点
//        Node curNode = head;
//        //当前节点的下一节点
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
//    * @Description: 从尾到头输出单链表   递归法
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
//    //先反转链表，再顺序输出
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
