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
class userNode{
    TreeNode node;
    int index;
    userNode(TreeNode node, int index){
        this.node = node;
        this.index = index;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int width = 0;
        if(root==null) return width;
        Queue<userNode> q = new LinkedList<>();
        q.add(new userNode(root, 1));
        while(!q.isEmpty()){
            int size = q.size();
            userNode first = null;
            userNode last = null;
            for(int i=0;i<size;i++){
                userNode temp = q.poll();
                if(first==null) first = temp;
                last = temp;
                if(temp.node.left != null) q.add(new userNode(temp.node.left, temp.index*2));
                if(temp.node.right != null) q.add(new userNode(temp.node.right, (temp.index*2)+1));
            }
            width = Math.max(width, (last.index-first.index+1));
        }

        return width;
    }
}