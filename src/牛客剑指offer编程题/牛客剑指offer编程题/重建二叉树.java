package ţ�ͽ�ָoffer�����.ţ�ͽ�ָoffer�����;

/**
 * @program: exercise
 * @description:  ����ǰ������� ������
 * @author: Jojo.Lee
 * @create: 2019-08-24 21:34
 **/

class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
}

public class �ؽ������� {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return this.buildTree(pre,0,pre.length-1, in, 0, in.length-1);
    }
    private TreeNode buildTree(int [] preTree, int start1, int end1, int [] inTree, int start2, int end2){
        if (start1 > end1 || start2 > end2) return null;
        int rootdata = preTree[start1];
        TreeNode root = new TreeNode(rootdata);
        //�������������ҵ���ǰ���ڵ��λ��
        int rootIndex = findRootIndex(inTree, rootdata);
        int offset = rootIndex-start2-1;
        TreeNode left = buildTree(preTree, start1+1, start1+1+offset, inTree,start2,start2+offset);
        TreeNode right = buildTree(preTree,start1+offset+2,end1,inTree,rootIndex+1,end2);
        root.left = left;
        root.right = right;
        return root;
    }
    public int findRootIndex(int [] inTree, int x){
        for (int i = 0; i < inTree.length; i++){
            if (inTree[i] == x) return i;
        }
        return -1;
    }

    //�������    �� ��  ���ڵ�
    public void postOrder(TreeNode localroot){
        if (localroot!=null){
            postOrder(localroot.left);
            postOrder(localroot.right);
            System.out.print(localroot.val+" ");
        }
    }
    public static void main(String[] args) {
        int [] pre = {1,2,4,8,9,5,10,3,6,7};
        int [] in = {8,4,9,2,10,5,1,6,3,7};
        �ؽ������� tree= new �ؽ�������();
        tree.postOrder(tree.reConstructBinaryTree(pre,in));
    }
}












