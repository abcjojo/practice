package ţ�ͽ�ָoffer�����.ţ�ͽ�ָoffer�����;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-31 11:04
 **/

public class ����������� {
    public int TreeDepth(TreeNode root) {

        if (root == null) return  0;

        int leftnode = TreeDepth(root.left);
        int rightnode = TreeDepth(root.right);

        return Math.max(leftnode,rightnode)+1;

    }
}
