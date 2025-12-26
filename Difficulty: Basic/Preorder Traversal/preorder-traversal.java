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

class Solution {
    public void fn(Node root, ArrayList<Integer> lst){
        if(root!=null) lst.add(root.data);
        else return;
        fn(root.left, lst);
        fn(root.right, lst);
    }
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> lst = new ArrayList<>();
        fn(root, lst);
        return lst;
    }
}