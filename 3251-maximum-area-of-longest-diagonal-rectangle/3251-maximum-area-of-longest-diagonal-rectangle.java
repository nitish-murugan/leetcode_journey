class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double length = 0;
        double area = 0;
        double epsilon = 1e-6; 
        
        for (int[] arr : dimensions) {
            double tempLength = Math.sqrt((arr[0] * arr[0]) + (arr[1] * arr[1]));
            double tempArea = arr[0] * arr[1];
            if (tempLength > length + epsilon) {
                length = tempLength;
                area = tempArea;
            } else if (Math.abs(tempLength - length) < epsilon) {
                area = Math.max(area, tempArea);
            }
        }
        return (int) area;
    }
}
