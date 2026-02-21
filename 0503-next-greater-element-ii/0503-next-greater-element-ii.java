class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            boolean flag = true;
            for(int j=i+1;j<(i+nums.length);j++){
                if(nums[i]<nums[j%nums.length]){
                    result[i] = nums[j%nums.length];
                    flag = false;
                    break;
                }
            }
            if(flag) result[i] = -1;
        }
        return result;
    }
}