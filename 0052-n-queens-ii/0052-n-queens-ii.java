class Solution {
    public void fn(int col, int n, int[] total, HashSet<Integer> rows, HashSet<Integer> dia1, HashSet<Integer> dia2){
        if(col == n){
            total[0]++;
            return; 
        }

        for(int row=0;row<n;row++){
            if(rows.contains(row) || dia1.contains(row-col) || dia2.contains(row+col)) continue;

            rows.add(row);
            dia1.add(row-col);
            dia2.add(row+col);

            fn(col+1,n,total,rows,dia1,dia2);

            rows.remove(row);
            dia1.remove(row-col);
            dia2.remove(row+col);
        }
    }
    public int totalNQueens(int n) {
        int[] total = new int[1];
        fn(0,n,total,new HashSet<>(),new HashSet<>(),new HashSet<>());
        return total[0];
    }
}