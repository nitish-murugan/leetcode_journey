class Solution {
    public int trap(int[] height) {
        int length = height.length;
        int[] leftMax = new int[length];
        int[] rightMax = new int[length];
        int tempMax = -1;
        for(int i=0;i<length;i++){
            tempMax = Math.max(tempMax,height[i]);
            leftMax[i] = tempMax;
        }
        tempMax = -1;
        for(int i=length-1;i>=0;i--){
            tempMax = Math.max(tempMax,height[i]);
            rightMax[i] = tempMax;
        }
        int rains = 0;
        for(int i=0;i<length;i++){
            rains+=(Math.min(leftMax[i],rightMax[i])-height[i]);
        }
        return rains;
    }
}