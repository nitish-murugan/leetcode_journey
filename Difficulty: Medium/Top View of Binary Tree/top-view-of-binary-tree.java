/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class userNode{
    Node node;
    int col;
    userNode(Node node, int col){
        this.node = node;
        this.col = col;
    }
}
class Solution {
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> lst = new ArrayList<>();
        if(root == null) return lst;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<userNode> q = new LinkedList<>();
        q.add(new userNode(root,0));
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                userNode tempObj = q.poll();
                if(!map.containsKey(tempObj.col)){
                    map.put(tempObj.col, tempObj.node.data);
                }
                if(tempObj.node.left != null) q.add(new userNode(tempObj.node.left,tempObj.col-1));
                if(tempObj.node.right != null) q.add(new userNode(tempObj.node.right,tempObj.col+1));
            }
        }
        for(int key: map.keySet()) lst.add(map.get(key));
        return lst;
    }
}