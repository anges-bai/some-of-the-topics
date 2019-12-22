import javax.swing.tree.TreeNode;


/**
 * @Author: BaiMiao
 * @Date: 2019/12/22 18:11
 * @Description: 实现一个函数，检查二叉树是否平衡，平衡的定义如下，对于树中的任意一个结点，
 * 其两颗子树的高度差不 超过1。 给定指向树根结点的指针TreeNode* root，请返回一个bool，
 * 代表这棵树是否平衡。
 */
public class MyClass12 {
}

class Balance {
    public boolean isBalance(TreeNode root) {
        //判断根元素是否为null
        if (root == null) {
            return true;
        }
        //获取左边子树高度
        int leftHeight = getTreeHeight(root.left);
        int rightHeight = getTreeHeight(root.right);
        //左右子树的高度大于1表示不是平衡二叉树
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        //isBalance()检查是否平衡
        return isBalance(root.left) && isBalance(root.right);
    }

    //计算树的高度
    public static int getTreeHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getTreeHeight(root.left), getTreeHeight(root.right)) + 1;
    }
}
