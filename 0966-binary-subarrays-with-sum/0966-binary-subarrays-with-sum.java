class Solution {
    public int atMost(int[] nums, int goal){
        int left=0, right=0, count=0, sum=0;
        if(goal<0) return 0;
        while(right<nums.length){
            sum+=nums[right];
            while(sum>goal){
                sum-=nums[left];
                left++;
                if(left>right) break;
            }
            count+=(right-left+1);
            right++;
        }
        return count;
        
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
}