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
class User{
    TreeNode node;
    int level, vertices;
    User(TreeNode node, int level, int vertices){
        this.node = node;
        this.level = level;
        this.vertices = vertices;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer, Map<Integer, List<Integer>>> map = new TreeMap<>();
        Queue<User> q = new LinkedList<>();
        List<List<Integer>> lst = new ArrayList<>();
        if(root == null) return lst;

        q.add(new User(root, 0, 0));
        while(!q.isEmpty()){
            User temp = q.poll();
            if (!map.containsKey(temp.vertices)) {
                map.put(temp.vertices, new TreeMap<>());
            }
            if(!map.get(temp.vertices).containsKey(temp.level)){
                map.get(temp.vertices).put(temp.level, new ArrayList<>());
            }
            map.get(temp.vertices).get(temp.level).add(temp.node.val);
            if(temp.node.left != null) q.add(new User(temp.node.left, temp.level+1, temp.vertices-1));
            if(temp.node.right != null) q.add(new User(temp.node.right, temp.level+1, temp.vertices+1));
        }

        for(int vertices: map.keySet()){
            List<Integer> temp = new ArrayList<>();
            Map<Integer, List<Integer>> levels = map.get(vertices);
            for(int level: levels.keySet()){
                List<Integer> val = levels.get(level);
                Collections.sort(val);
                for(int v: val) temp.add(v);
            }
            lst.add(temp);
        }
        return lst;
        
    }
}