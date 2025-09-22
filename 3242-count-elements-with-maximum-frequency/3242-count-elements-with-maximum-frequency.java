class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];
        int max = 0;
        int count = 0;
        for(int i: nums){
            arr[i]++;
            max = Math.max(arr[i],max);
        }
        for(int i: arr){
            if(i==max) count+=i;
        }
        return count;
    }
}