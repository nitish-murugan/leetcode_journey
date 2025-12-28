int countNegatives(int** grid, int gridSize, int* gridColSize) {
    int count = 0;
    for(int i=0;i<gridSize;i++){
        for(int j=0;j<*(gridColSize+i);j++){
            int temp = *(*(grid+i)+j);
            if(temp < 0){
                count+=(*(gridColSize+i)-j);
                break;
            }
        }
    }
    return count;
}