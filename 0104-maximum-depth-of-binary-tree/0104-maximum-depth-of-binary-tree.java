/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void height(TreeNode root, int temp, int[] max){
        if(root == null) return;
        if(root.left!=null){
            temp++;
            max[0] = Math.max(max[0], temp);
            height(root.left, temp, max);
            temp--;
        }
        if(root.right!=null){
            temp++;
            max[0] = Math.max(max[0], temp);
            height(root.right, temp, max);
            temp--;
        } 

    }
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int[] max = new int[1];
        height(root, 0, max);
        return max[0]+1;
    }
}