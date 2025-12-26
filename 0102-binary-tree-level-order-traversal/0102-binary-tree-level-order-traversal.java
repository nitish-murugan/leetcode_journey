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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return lst;
        queue.offer(root);
        while(queue.size() != 0){
            int size = queue.size();
            List<Integer> tempLst = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp = queue.poll();
                if (temp!=null) tempLst.add(temp.val);
                if (temp.left!=null) queue.add(temp.left);
                if (temp.right!=null) queue.add(temp.right);
            }
            lst.add(new ArrayList<>(tempLst));
        }

        return lst;
    }
}