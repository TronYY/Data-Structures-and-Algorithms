public class Solution {
    public void Mirror(TreeNode root) {
        if (root==null) return;
        TreeNode temp=new TreeNode(0);
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
/*
×óÓÒ×ÓÊ÷½»»» ÔÙµÝ¹é
*/