class Solution {
    public TreeNode helper(int[] nums,int i,int j){
        if(i>j)
            return null;
         int mid = (i+j)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.right=helper(nums,mid+1,j);
        root.left=helper(nums,i,mid-1);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
       TreeNode ans = helper(nums,0,nums.length-1);
        return ans;
       
    }
}