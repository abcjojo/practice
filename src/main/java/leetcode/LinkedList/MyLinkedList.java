//package leetcode.LinkedList;
//
///**
// * @program: exercise
// * @description: ����ʵ������
// * @author: Jojo.Lee
// * @create: 2019-08-10 18:15
// **/
//public class MyLinkedList {
//    //����ͷ
//    Node head = null;
//
//    public void addNode(int data){
//        Node newNode = new Node(data);
//        //�����һ���ڵ�
//        if(head==null){
//            head = newNode;
//            return ;
//        }
//        //����ǵ�һ���ڵ㣺�ҵ��ڵ�β��������
//        Node tmp = head;
//        while(tmp.next!=null){
//            tmp = tmp.next;
//        }
//        tmp.next = newNode;
//    }
//
//    //���ݴ�����±�ɾ����Ӧ�ڵ�
//    public boolean deleteNode(int index){
//        //������±겻�Ϸ����±��1��ʼ����
//        if(index>length() || index<1){
//            return false;
//        }
//        if (index==1){
//            head=head.next;
//            return true;
//        }
//        Node preNode = head;//�ϸ��ڵ�
//        Node curNode =preNode.next;
//        int i=2;//curNode��ǰ���±�2�����±��1��ʼ������
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
//    //����������
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
//    //�������������������󷵻�ͷ���   ð������
//    public Node orderNode(){
//        Node currentNode = head;
//        while (currentNode!=null){
//            //����nextNode ��������currentNode���¸��ڵ㣬���Ƚ�
//            Node nextNode = currentNode.next;
//            while (nextNode!=null){
//                //��С����ƨ����
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
