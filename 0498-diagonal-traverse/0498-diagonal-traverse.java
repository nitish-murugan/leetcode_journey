class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = 0, col = 0, index = 0;
        int rowMax = mat.length, colMax = mat[0].length;
        int[] arr = new int[rowMax*colMax];
        boolean up = true;
        while(row<=rowMax-1 && col<=colMax-1){
            arr[index++] = mat[row][col];
            if(up){
                if((row-1>=0 && row-1<=rowMax-1) && (col+1>=0 && col+1<=colMax-1)){
                    row--;
                    col++;
                } else{
                    if(col+1>=colMax){
                        row++;
                    } else{
                        col++;
                    }
                    up = !up;
                }
            } else{
                if((row+1>=0 && row+1<=rowMax-1) && (col-1>=0 && col-1<=colMax-1)){
                    row++;
                    col--;
                } else{
                    if(row+1>=rowMax){
                        col++;
                    } else{
                        row++;
                    }
                    up = !up;
                }
            }
        }
        System.out.println(row+" "+col);
        return arr;
    }
}