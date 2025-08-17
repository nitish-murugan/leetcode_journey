class Solution {
    public boolean fn(TreeNode root, int target, int sum) {
        if (root == null) return false;  
        sum += root.val;
        
        if (root.left == null && root.right == null) {
            return sum == target;
        }
        
        return fn(root.left, target, sum) || fn(root.right, target, sum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return fn(root, targetSum, 0);
    }
}
