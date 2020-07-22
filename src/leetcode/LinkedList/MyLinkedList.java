//package leetcode.LinkedList;
//
///**
// * @program: exercise
// * @description: 数组实现链表
// * @author: Jojo.Lee
// * @create: 2019-08-10 18:15
// **/
//public class MyLinkedList {
//    //链表头
//    Node head = null;
//
//    public void addNode(int data){
//        Node newNode = new Node(data);
//        //插入第一个节点
//        if(head==null){
//            head = newNode;
//            return ;
//        }
//        //插入非第一个节点：找到节点尾部，插入
//        Node tmp = head;
//        while(tmp.next!=null){
//            tmp = tmp.next;
//        }
//        tmp.next = newNode;
//    }
//
//    //根据传入的下标删除对应节点
//    public boolean deleteNode(int index){
//        //传入的下标不合法，下标从1开始计数
//        if(index>length() || index<1){
//            return false;
//        }
//        if (index==1){
//            head=head.next;
//            return true;
//        }
//        Node preNode = head;//上个节点
//        Node curNode =preNode.next;
//        int i=2;//curNode当前在下标2处（下标从1开始计数）
//        while (curNode!=null){
//            if(i==index){
//                preNode.next = curNode.next;
//                return true;
//            }
//            preNode = preNode.next;
//            curNode = curNode.next;
//            i++;
//        }
//        return false;
//    }
//
//    //计算链表长度
//    public int length(){
//        int length=0;
//        Node tmp = head;
//        while (tmp!=null){
//            length++;
//            tmp = tmp.next;
//        }
//        return length;
//    }
//
//    //对链表进行排序，排完序后返回头结点   冒泡排序
//    public Node orderNode(){
//        Node currentNode = head;
//        while (currentNode!=null){
//            //定义nextNode 来保存与currentNode的下个节点，并比较
//            Node nextNode = currentNode.next;
//            while (nextNode!=null){
//                //从小到大屁排序
//                if(currentNode.dataInt>nextNode.dataInt){
//                    int tmp = currentNode.dataInt;
//                    currentNode.dataInt = nextNode.dataInt;
//                    nextNode.dataInt = tmp;
//                }
//                nextNode = nextNode.next;
//            }
//            currentNode = currentNode.next;
//        }
//        return head;
//    }
//    public void toLinkedListString(){
//        Node node = head;
//        while (node!=null){
//            System.out.println(node.dataInt);
//            node = node.next;
//        }
//    }
//}
