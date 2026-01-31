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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> lst = new ArrayList<>();
        if(root == null) return lst;
        Map<TreeNode, TreeNode> map = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        map.put(root, null);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                if(temp.left != null){
                    map.put(temp.left, temp);
                    q.add(temp.left);
                }
                if(temp.right != null){
                    map.put(temp.right, temp);
                    q.add(temp.right);
                }
            }
        }

        Set<TreeNode> visited = new HashSet<>();
        q.clear();
        q.add(target);
        int distance = 0;
        while(distance<k){
            if(distance==k) break;

            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                if(temp==null) continue;
                visited.add(temp);
                if(!visited.contains(map.get(temp))){
                    q.add(map.get(temp));
                    visited.add(map.get(temp));
                }
                if(temp.left!=null && !visited.contains(temp.left)){
                    q.add(temp.left);
                    visited.add(temp.left);
                }
                if(temp.right!=null && !visited.contains(temp.right)){
                    q.add(temp.right);
                    visited.add(temp.right);
                }
            }
            distance++;
        }

        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp!=null) lst.add(temp.val);
        }

    
        return lst;
    }
}