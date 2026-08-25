class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int temp = k;
        for(int i: nums){
            if(i<k) continue;
            if(i==k){
                k+=temp;
            }
            if(i>k){
                return k;
            }
        }
        return k;
    }
}