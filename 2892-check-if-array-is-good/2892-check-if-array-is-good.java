class Solution {
    public boolean isGood(int[] nums) {
        int[] arr = new int[nums.length+1];
        int temp = 0;
        boolean last = false;
        for(int i: nums){
            if(i<nums.length && arr[i]==0){
                arr[i] = 1;
                temp++;
            } else if(i<nums.length && i == nums.length-1 && !last){
                temp++;
                last = true;
            }
        }
        return temp==nums.length;
    }
}