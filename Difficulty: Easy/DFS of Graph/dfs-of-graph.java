class Solution {
    public void dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] visited, ArrayList<Integer> lst){
        lst.add(node);
        visited[node] = 1;
        for(int val: adj.get(node)){
            if(visited[val]==0){
                visited[val] = 1;
                dfs(val, adj, visited, lst);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> lst = new ArrayList<>();
        int[] visited = new int[adj.size()];
        dfs(0, adj, visited, lst);
        return lst;
    }
}