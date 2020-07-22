package leetcode.LinkedList;

/**
 * @program: exercise
 * @description:       公共类，节点 ，有data和next两个属性
 * @author: Jojo.Lee
 * @create: 2019-08-10 16:27
 **/
public class Node<E> {
    Node left = null;
    Node right = null;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public Node(Node left, Node right, int data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }
    //    public Node<E> next = null;
//    public E data;
//    int dataInt;
//    public Node(E data){
//        this.data = data;
//    }
//
//    public Node(int dataInt){
//        this.dataInt = dataInt;
//    }
}
