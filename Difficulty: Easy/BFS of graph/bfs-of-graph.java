class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> lst = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[adj.size()];
        q.add(0);
        visited[0] = 1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int temp = q.poll();
                lst.add(temp);
                for(int val: adj.get(temp)){
                    if(visited[val]==0){
                        q.add(val);
                        visited[val] = 1;
                    }
                }
                
            }
        }
        return lst;
    }
}