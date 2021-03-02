class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int count = Math.max(maxDepth(root.left),maxDepth(root.right));
        return count+1;
    }
}