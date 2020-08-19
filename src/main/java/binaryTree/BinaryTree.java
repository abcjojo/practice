package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: exercise
 * @description: ��д������
 * @author: Jojo.Lee
 * @create: 2019-08-22 11:00
 **/

class Node{
    Node leftNode = null;
    Node rightNode = null;
    int data;
    public Node(int data){
        this.data = data;
    }
}

public class BinaryTree {
    Node root;
    public BinaryTree(){
        root = null;
    }

    //��������в�������
    public Node insert(int data){
        Node node = new Node(data);
        if (root==null) root=node;
        else{
            Node curNode = root;
            Node parent;
            //Ѱ�Ҳ����λ��
            while(true){
                parent = curNode;
                if(node.data<curNode.data){
                    if (curNode.leftNode==null){
                        curNode.leftNode = node;
                        return null;
                    }
                    curNode = curNode.leftNode;
                }else{
                    if(curNode.rightNode==null){
                        curNode.rightNode = node;
                        return null;
                    }
                    curNode = curNode.rightNode;
                }
            }
        }
        return root;
    }

    //���������빹��������
    public Node buideTree(int [] array){
        for(int i=0; i<array.length; i++){
            insert(array[i]);
        }
        return root;
    }

    //���������������  ���Ҹ��ڵ㣬������������������û����������������
    public void preOrder(Node localroot){
        if(localroot!=null){
            System.out.print(localroot.data+" ");
            preOrder(localroot.leftNode);
            preOrder(localroot.rightNode);
        }
    }
    public void preOrder(){
        this.preOrder(root);
    }

    //�������  ��(��)�ڵ��λ�����м�
    public void inOrder(Node localroot){
        if (localroot != null) {
            inOrder(localroot.leftNode);
            System.out.print(localroot.data+" ");
            inOrder(localroot.rightNode);
        }
    }
    public void inOrder(){
        this.inOrder(root);
    }

    //�������  ���ڵ�������ӡ
    public void postOrder(Node localroot){
        if (localroot != null) {
            postOrder(localroot.leftNode);
            postOrder(localroot.rightNode);
            System.out.print(localroot.data+" ");
        }
    }
    public void postOrder(){
        this.postOrder(root);
    }

    //����ʵ�ֶ������Ĳ�α���
    public void treeVisit(Node root){
        if (root==null) return;
        Queue<Node> list = new LinkedList<>();
        list.add(root);
        while(!list.isEmpty()){
            Node node = list.poll();
            System.out.print(node.data + " ");
            if(node.leftNode!=null) list.add(node.leftNode);
            if (node.rightNode!=null) list.add(node.rightNode);
        }

    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        int data[] = {2,8,7,4,9,3,1,6,7,5};
        Node root = bt.buideTree(data);
//        System.out.println("���������");
        //bt.inOrder();
//        System.out.println("���������");
   //    bt.preOrder();
//        System.out.println("���������");
      // bt.postOrder();

        bt.treeVisit(root);
    }
}












