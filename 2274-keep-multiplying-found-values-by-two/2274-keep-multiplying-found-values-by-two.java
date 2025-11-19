class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int length = nums.length;
        for(int i=0;i<length;i++){
            if(nums[i]==original){
                original*=2;
            } else if(original<nums[i]){
                break;
            }
        }
        return original;
    }
}