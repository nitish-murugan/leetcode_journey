/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String res = "";
        if(root==null) return "";
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                if(temp!=null && temp.val==1001){
                    res+="#,";
                    continue;
                }
                if(temp!=null && temp.val!=1001) res+=(temp.val+",");
                if(temp.left!=null && temp.val!=1001) q.add(temp.left);
                else q.add(new TreeNode(1001));
                if(temp.right!=null && temp.val!=1001) q.add(temp.right);
                else q.add(new TreeNode(1001));
            }
        }
        return res;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data=="") return null;
        String[] nodeData = data.split(",");
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(nodeData[0]));
        q.add(root);

        int index = 1;
        while(!q.isEmpty() && index<nodeData.length){
            TreeNode temp = q.poll();
            if(!nodeData[index].equals("#")){
                temp.left = new TreeNode(Integer.parseInt(nodeData[index]));
                q.add(temp.left);
            }
            index++;
            if(!nodeData[index].equals("#")){
                temp.right = new TreeNode(Integer.parseInt(nodeData[index]));
                q.add(temp.right);
            }
            index++;
        }
        

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));