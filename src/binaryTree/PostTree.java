package binaryTree;

/**
 * @program: exercise
 * @description: 已知前中序遍历，求后序遍历
 * @author: Jojo.Lee
 * @create: 2019-08-23 19:22
 **/

//根据前中序构建二叉树，在后序遍历二叉树
public class PostTree {
    private Node root;
    public PostTree(){
        root = null;
    }

    //后序遍历    左 右  根节点
    public void postOrder(Node localroot){
        if (localroot!=null){
            postOrder(localroot.leftNode);
            postOrder(localroot.rightNode);
            System.out.print(localroot.data+" ");
        }
    }
    public void postOrder(){
        this.postOrder(root);
    }

    //利用已知的前中序数组构建二叉树
    public Node initTree(int[] preOrder, int start1, int end1, int[] inOrder, int start2,  int end2){
        if (start1>end1 || start2>end2) return null;
        //保存根节点数据
        int rootData = preOrder[start1];
        //保存根节点
        Node root = new Node(rootData);
        //找到根节点的在中序数组中的下标，以划分左右子树
        int rootIndex = findIndexInArray(inOrder,rootData,start2,end2);
        int offSet = rootIndex-start2-1;
        //构建左子树
        Node left = initTree(preOrder,start1+1,start1+1+offSet,inOrder,start2,start2+offSet);
        //构建右子树
        Node right = initTree(preOrder,start1+offSet+2,end1,inOrder,rootIndex+1,end2);

        root.leftNode = left;
        root.rightNode = right;
        return root;
    }

    //找到根节点的下标
    public int findIndexInArray(int[] inOrder,int index, int begin, int end){
        for (int i=begin; i<=end;i++){
            if (inOrder[i]==index){
                return i;
            }
        }
        return -1;
    }
}









