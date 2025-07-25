class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0, max=Integer.MIN_VALUE;
        HashSet<Integer> seen = new HashSet<>();
        for(int i: nums){
            if(!seen.contains(i)){
                seen.add(i);
                sum+=i;
                max = Math.max(sum,max);
                if(sum<0) sum=0;
            } else{
                seen.clear();
                seen.add(i);
            }
        }
        return max;
    }
}