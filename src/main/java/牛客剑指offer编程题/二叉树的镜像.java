package ţ�ͽ�ָoffer�����;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-26 12:56
 **/
public class �������ľ��� {
    public void Mirror(TreeNode root) {
        if (root == null){
            return ;
        }
        if (root.left == null && root.right == null) return ;
        TreeNode node  = root.left;
        root.left = root.right;
        root.right = node;
        if (root.left!=null) Mirror(root.left);
        if (root.right!=null) Mirror(root.right);
    }
}
