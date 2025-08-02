class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j] == '.') continue;
                else{
                    for(int row=0;row<9;row++){
                        if(row==i) continue;
                        if(board[row][j]==board[i][j]) return false;
                    }
                    for(int col=0;col<9;col++){
                        if(col==j) continue;
                        if(board[i][col]==board[i][j]) return false;
                    }
                    int row = (i/3)==0?0:((i/3)==1?3:((i/3)==2?6:0));
                    int col = (j/3)==0?0:((j/3)==1?3:((j/3)==2?6:0));
                    for(int rowTemp=row;rowTemp<row+3;rowTemp++){
                        for(int colTemp=col;colTemp<col+3;colTemp++){
                            if(rowTemp==i && colTemp==j) continue;
                            if(board[rowTemp][colTemp] == board[i][j]) return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}