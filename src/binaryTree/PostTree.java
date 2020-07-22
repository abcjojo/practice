package binaryTree;

/**
 * @program: exercise
 * @description: ��֪ǰ�����������������
 * @author: Jojo.Lee
 * @create: 2019-08-23 19:22
 **/

//����ǰ���򹹽����������ں������������
public class PostTree {
    private Node root;
    public PostTree(){
        root = null;
    }

    //�������    �� ��  ���ڵ�
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

    //������֪��ǰ�������鹹��������
    public Node initTree(int[] preOrder, int start1, int end1, int[] inOrder, int start2,  int end2){
        if (start1>end1 || start2>end2) return null;
        //������ڵ�����
        int rootData = preOrder[start1];
        //������ڵ�
        Node root = new Node(rootData);
        //�ҵ����ڵ�������������е��±꣬�Ի�����������
        int rootIndex = findIndexInArray(inOrder,rootData,start2,end2);
        int offSet = rootIndex-start2-1;
        //����������
        Node left = initTree(preOrder,start1+1,start1+1+offSet,inOrder,start2,start2+offSet);
        //����������
        Node right = initTree(preOrder,start1+offSet+2,end1,inOrder,rootIndex+1,end2);

        root.leftNode = left;
        root.rightNode = right;
        return root;
    }

    //�ҵ����ڵ���±�
    public int findIndexInArray(int[] inOrder,int index, int begin, int end){
        for (int i=begin; i<=end;i++){
            if (inOrder[i]==index){
                return i;
            }
        }
        return -1;
    }
}









