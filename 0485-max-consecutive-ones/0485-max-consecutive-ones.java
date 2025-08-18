class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for(int i: nums){
            if(i==1) count++;
            maxCount = Math.max(maxCount,count);
            if(i==0) count=0;
        }
        return maxCount;
    }
}