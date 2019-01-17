public class $06_ReConstructBinaryTree_BT {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return build(pre,in,0,pre.length-1,0,in.length-1);
        
    }
    
    public TreeNode build(int[] pre,int[] in,int ps,int pe,int is,int ie) {
        if (ps>pe) return null;
        TreeNode root=new TreeNode(pre[ps]);
        if (ps==pe) return root;
        for (int i=is;i<=ie;i++) {
            if (in[i]==pre[ps]) {
                root.left=build(pre,in,ps+1,i+ps-is,is,i-1);//长度上前序的根+左=中序的左+根
                root.right=build(pre,in,i+ps-is+1,pe,i+1,ie);
                break;
            }
        }
        return root;
    }
}