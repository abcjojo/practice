package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: exercise
 * @description: 手写二叉树
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

    //向二叉树中插入数据
    public Node insert(int data){
        Node node = new Node(data);
        if (root==null) root=node;
        else{
            Node curNode = root;
            Node parent;
            //寻找插入的位置
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

    //将数据输入构建二叉树
    public Node buideTree(int [] array){
        for(int i=0; i<array.length; i++){
            insert(array[i]);
        }
        return root;
    }

    //二叉树的先序遍历  先找根节点，有左子树找左子树，没有左子树找右子树
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

    //中序遍历  根(父)节点的位置在中间
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

    //后序遍历  根节点在最后打印
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

    //队列实现二叉树的层次遍历
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
//        System.out.println("中序遍历：");
        //bt.inOrder();
//        System.out.println("先序遍历：");
   //    bt.preOrder();
//        System.out.println("后序遍历：");
      // bt.postOrder();

        bt.treeVisit(root);
    }
}












