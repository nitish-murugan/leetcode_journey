class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int count = 0;
        int length = nums.length;
        for(int l=0;l<length;l++){
            if(nums[l]%2==0 && nums[l]<=threshold){
                int r = l;
                while(r+1<length && nums[r]%2!=nums[r+1]%2 && nums[r+1]<=threshold){
                    r++;
                }
                count = Math.max(count,r-l+1);
            }
        }
        return count;
    }
}