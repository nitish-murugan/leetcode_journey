/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class userNode{
    Node node;
    int col;
    int level;
    userNode(Node node, int col, int level){
        this.node = node;
        this.col = col;
        this.level = level;
    }
}

class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        ArrayList<Integer> lst = new ArrayList<>();
        if(root == null) return lst;
        Queue<userNode> q = new LinkedList<>();
        Map<Integer, List<Integer>> map = new TreeMap<>();
        q.add(new userNode(root, 0, 1));
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                userNode temp = q.poll();
                if(!map.containsKey(temp.col)){
                    map.put(temp.col, new ArrayList<>(Arrays.asList(temp.node.data, temp.level)));
                } else{
                    if(map.get(temp.col).get(1)<=temp.level){
                        map.put(temp.col, new ArrayList<>(Arrays.asList(temp.node.data, temp.level)));
                    }
                }
                if(temp.node.left != null) q.add(new userNode(temp.node.left, temp.col-1, temp.level+1));
                if(temp.node.right != null) q.add(new userNode(temp.node.right, temp.col+1, temp.level+1));
            }
        }
        for(int key: map.keySet()){
            lst.add(map.get(key).get(0));
        }
        return lst;
    }
}