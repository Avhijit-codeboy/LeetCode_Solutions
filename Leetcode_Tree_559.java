class Solution {
    public int maxDepth(Node root) {
        if(root==null)
            return 0;
        int count = 0;
        int size = root.children.size();
        for(int i=0;i<size;i++){
            count=Math.max(count,maxDepth(root.children.get(i)));
        }
        return count+1;
    }
}