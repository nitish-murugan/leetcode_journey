import java.util.*;
class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> lst = new ArrayList<>();
        int nodes = adj.size();
        boolean[] visited = new boolean[nodes];
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        visited[0] = true;
        
        while(!q.isEmpty()){
            int out = q.poll();
            lst.add(out);
            for(int i: adj.get(out)){
                if(!visited[i]){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
        
        return lst;
    }
}