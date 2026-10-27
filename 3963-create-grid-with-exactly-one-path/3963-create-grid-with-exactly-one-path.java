class Solution {
    public String[] createGrid(int m, int n) {
        String[] arr = new String[m];
        for(int i=0;i<m;i++){
            StringBuilder str = new StringBuilder();
            for(int j=0;j<n;j++){
                if(j==0 || i==m-1) str.append(".");
                else str.append("#");
            }
            arr[i] = str.toString();
        }
        return arr;
    }
}