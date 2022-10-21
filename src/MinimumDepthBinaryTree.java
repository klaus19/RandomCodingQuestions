public class MinimumDepthBinaryTree {

    public int minDepth(TreeNode root){
        if (root == null) return 0;
        int L = minDepth(root.left), R = minDepth(root.right);
        return L<R && L>0 || R<1 ? 1+L : 1+R;
    }
}
