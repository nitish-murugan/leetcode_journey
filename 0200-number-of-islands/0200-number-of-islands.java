class Solution {
    public void dfs(char[][] grid, int[][] visited, Stack<List<Integer>> stack){
        while(!stack.isEmpty()){
            List<Integer> lst = stack.pop();
            int i = lst.get(0), j = lst.get(1);
            if(visited[i][j]==0){
                visited[i][j] = 1;
                if(i-1>=0 && grid[i-1][j]=='1'){
                    stack.add(new ArrayList<>(Arrays.asList(i-1,j)));
                    dfs(grid,visited,stack);
                }
                if(j+1<grid[i].length && grid[i][j+1]=='1'){
                    stack.add(new ArrayList<>(Arrays.asList(i,j+1)));
                    dfs(grid,visited,stack);
                }
                if(i+1<grid.length && grid[i+1][j]=='1'){
                    stack.add(new ArrayList<>(Arrays.asList(i+1,j)));
                    dfs(grid,visited,stack);
                }
                if(j-1>=0 && grid[i][j-1]=='1'){
                    stack.add(new ArrayList<>(Arrays.asList(i,j-1)));
                    dfs(grid,visited,stack);
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int[][] visited = new int[grid.length][grid[0].length];
        Stack<List<Integer>> stack = new Stack<>();
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1' && visited[i][j]==0){
                    stack.add(new ArrayList<>(Arrays.asList(i,j)));
                    dfs(grid,visited,stack);
                    count++;
                }
            }
        }
        return count;
    }
}