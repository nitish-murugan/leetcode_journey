class Solution {
    public boolean check(int row, int col, char[][] board, char num){
        for(int i=0;i<9;i++) if(board[row][i]==num) return false;
        for(int i=0;i<9;i++) if(board[i][col]==num) return false;
        int tempCol = (col/3)==0?0:((col/3)==1?3:((col/3)==2)?6:0);
        int tempRow = (row/3)==0?0:((row/3)==1?3:((row/3)==2)?6:0);
        for(int i=tempRow;i<tempRow+3;i++){
            for(int j=tempCol;j<tempCol+3;j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }
    public boolean fn(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == '.'){
                    for(char num='1';num<='9';num++){
                        if(check(i,j,board,num)){
                            board[i][j] = num;
                            if(fn(board)) return true;
                            else board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        fn(board);
    }
}