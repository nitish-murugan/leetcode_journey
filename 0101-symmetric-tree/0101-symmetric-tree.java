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
    public boolean palindrome(List<Integer> lst){
        int i=0, j=lst.size()-1;
        while(i<j){
            if(lst.get(i)!=lst.get(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> tempLst = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                if(temp!=null) tempLst.add(temp.val);
                else{
                    tempLst.add(101);
                    continue;
                }
                if(temp.left != null) q.offer(temp.left);
                else q.offer(null);
                if(temp.right != null) q.offer(temp.right);
                else q.offer(null);
            }
            if(!palindrome(tempLst)) return false;
        }
        return true;
    }
}