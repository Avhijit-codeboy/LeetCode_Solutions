class Solution {
    List<Integer> po = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root==null){
            return po;
        }
        int size = root.children.size();
        po.add(root.val);
        for(int i=0;i<size;i++){
            
            preorder(root.children.get(i));
            
        }
        return po;
    }
}