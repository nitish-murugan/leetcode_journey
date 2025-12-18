class Solution {
    public void fn(int col, int n, List<List<String>> lst, List<String> temp, HashSet<Integer> rows, HashSet<Integer> dia1, HashSet<Integer> dia2){
        
        if(col == n){
            lst.add(new ArrayList<>(temp));
            return;
        }

        for(int row=0;row<n;row++){
            if(rows.contains(row) || dia1.contains(row-col) || dia2.contains(row+col)) continue;
            
            rows.add(row);
            String tempStr = "";
            for(int i=0;i<n;i++){
                if(i==row) tempStr+='Q';
                else tempStr+='.';
            }

            temp.add(tempStr);
            dia1.add(row-col);
            dia2.add(row+col);

            fn(col+1,n,lst,temp,rows,dia1,dia2);
            temp.remove(temp.size()-1);
            rows.remove(row);
            dia1.remove(row-col);
            dia2.remove(row+col);
        }

    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> lst = new ArrayList<>();
        fn(0,n,lst,new ArrayList<>(),new HashSet<>(),new HashSet<>(),new HashSet<>());
        return lst;
    }
}