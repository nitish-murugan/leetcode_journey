/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean fn(TreeNode root, TreeNode k, List<TreeNode> lst){
        if(root == null) return false;
        lst.add(root);
        if(root.val == k.val){
            return true;
        }
        if (fn(root.left, k, lst) || fn(root.right, k, lst)) {
            return true;
        }
        lst.remove(lst.size() - 1);
        return false;

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return root;
        List<TreeNode> lst1 = new ArrayList<>();
        List<TreeNode> lst2 = new ArrayList<>();
        fn(root, p, lst1);
        fn(root, q, lst2);
        int l1=lst1.size(), l2=lst2.size();
        if(l1>l2){
            TreeNode prev = null;
            for(int i=0;i<l2;i++){
                if(lst1.get(i)==lst2.get(i)) prev=lst1.get(i);
                else break;
            }
            return prev;
        } else{
            TreeNode prev = null;
            for(int i=0;i<l1;i++){
                if(lst1.get(i)==lst2.get(i)) prev=lst2.get(i);
                else break;
            }
            return prev;
        }
        
    }
}