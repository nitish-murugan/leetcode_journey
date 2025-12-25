class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long result = 0;
        int minus = 0;
        for(int i = happiness.length-1;i>=0 && k>0;i--){
            if(happiness[i]-minus >= 0) result+=(happiness[i]-minus);
            k--;
            minus++;
        }
        return result;
    }
}