class Solution {
    public boolean check(int i, int j, char[][] board, char target){
        for(int temp=0;temp<9;temp++) if(board[i][temp]==target) return false;
        for(int temp=0;temp<9;temp++) if(board[temp][j]==target) return false;
        int col = (j/3)==0?0:((j/3)==1?3:((j/3)==2)?6:0);
        int row = (i/3)==0?0:((i/3)==1?3:((i/3)==2)?6:0);
        for(int tempRow=row;tempRow<row+3;tempRow++){
            for(int tempCol=col;tempCol<col+3;tempCol++){
                if(board[tempRow][tempCol]==target) return false;
            }
        }
        return true;
    }
    public boolean fn(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    for(char num='1';num<='9';num++){
                        if(check(i,j,board,num)){
                            board[i][j] = num;
                            
                            if(fn(board)==true) return true;
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