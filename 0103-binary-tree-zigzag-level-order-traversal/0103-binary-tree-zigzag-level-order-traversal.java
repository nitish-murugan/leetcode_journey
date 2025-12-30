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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<>();
        if(root == null) return lst;
        Queue<TreeNode> q = new LinkedList<>();
        boolean rev = false;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> tempLst = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                tempLst.add(temp.val);
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }
            if(rev) Collections.reverse(tempLst);
            lst.add(new ArrayList<>(tempLst));
            rev = !rev;
        }

        return lst;
    }
}