/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    boolean leaf(Node root){
        return root.left==null && root.right==null;
    }
    
    void addLeftNode(Node root, ArrayList<Integer> lst){
        Node temp = root.left;
        while(temp != null){
            if(!leaf(temp)) lst.add(temp.data);
            if(temp.left != null) temp = temp.left;
            else temp = temp.right;
        }
    }
    
    void addLeaf(Node root, ArrayList<Integer> lst){
        if(leaf(root)) lst.add(root.data);
        if(root.left != null) addLeaf(root.left, lst);
        if(root.right != null) addLeaf(root.right, lst);
    }
    
    void addRightNode(Node root, ArrayList<Integer> lst){
        ArrayList<Integer> temp = new ArrayList<>();
        Node temp1 = root.right;
        while(temp1 != null){
            if(!leaf(temp1)) temp.add(temp1.data);
            if(temp1.right != null) temp1 = temp1.right;
            else temp1 = temp1.left;
        }
        for(int i=temp.size()-1;i>=0;i--) lst.add(temp.get(i));
    }
    
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> lst = new ArrayList<>();
        if(root == null) return lst;
        if(!leaf(root)) lst.add(root.data);
        addLeftNode(root, lst);
        addLeaf(root, lst);
        addRightNode(root, lst);
        return lst;
    }
}