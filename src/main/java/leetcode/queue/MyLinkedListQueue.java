//package leetcode.queue;
//
//import leetcode.LinkedList.Node;
//
///**
// * @program: exercise
// * @description: 链表实现队列
// * @author: Jojo.Lee
// * @create: 2019-08-11 15:33
// **/
//public class MyLinkedListQueue<E> {
//    Node<E> head;
//    Node<E> tail;
//
//    public E pop(){
//        if (isEmpty()){
//            return null;
//        }
//        E data = head.data;
//        head = head.next;
//        return data;
//    }
//
//    public void put(E data){
//        Node<E> node =  new Node<E>(data);
//        if(head==null && tail==null){
//            head = tail = node;
//        }else {
//            tail.next = node;
//            tail = node;
//        }
//    }
//
//    public boolean isEmpty(){
//        return size()==0;
//    }
//    public int size(){
//        Node<E> node = head;
//        int leng=0;
//        while (node!=null){
//            leng++;
//            node = node.next;
//        }
//        return leng;
//    }
//}
