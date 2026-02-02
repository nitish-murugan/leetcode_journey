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
    public TreeNode findNode(TreeNode root, int val){
        if (root == null) return null;
        if (root.val == val) return root;
        TreeNode left = findNode(root.left, val);
        if (left != null) return left;
        return findNode(root.right, val);
    }

    public int amountOfTime(TreeNode root, int start) {
        Map<TreeNode, TreeNode> map = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        int time = 0;
        if(root == null) return time;
        map.put(root, null);
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                if(temp.left!=null){
                    map.put(temp.left, temp);
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    map.put(temp.right, temp);
                    q.add(temp.right);
                }
            }
        }
        q.clear();

        q.add(root);
        TreeNode starting = null;
        while(!q.isEmpty()){
            int size = q.size();
            boolean flag = false;
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                if(temp.val == start){
                    starting = temp;
                    flag = true;
                    break;
                }
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            if(flag) break;
        }

        q.clear();
        q.add(starting);
        visited.add(starting);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                if(temp==null) continue;
                if(map.get(temp)!=null && !visited.contains(map.get(temp))){
                    visited.add(map.get(temp));
                    q.add(map.get(temp));
                }
                if(temp.left!=null && !visited.contains(temp.left)){
                    visited.add(temp.left);
                    q.add(temp.left);
                }
                if(temp.right!=null && !visited.contains(temp.right)){
                    visited.add(temp.right);
                    q.add(temp.right);
                }
            }
            time++;
        }

        return time-1;
    }
}