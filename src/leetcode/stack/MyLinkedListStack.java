//package leetcode.stack;
//
//import leetcode.LinkedList.Node;
//
///**
// * @program: exercise
// * @description: ����ʵ��ջ
// * @author: Jojo.Lee
// * @create: 2019-08-10 16:30
// **/
//public class MyLinkedListStack<E> {
//    //ջ��
//    Node<E> top = null;
//
//    public boolean isEmpty(){
//        return top==null;
//    }
//
//    public E pop(){
//        if (top==null) return  null;
//        E tmp = (E)top.data;
//        top = top.next;
//        return tmp;
//    }
//
//    public E peek(){
//        if(isEmpty()) return null;
//        return(E) top;
//    }
//
//    public E push(E data){
//        Node<E> tmp = new Node<>(data);
//        tmp.next = top;
//        top = tmp;
//        return top.data;
//    }
//
//}
