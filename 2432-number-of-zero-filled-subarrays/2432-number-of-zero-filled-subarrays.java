class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long result = 0;
        long count = 0;
        for(int i: nums){
            if(i!=0){
                result+=count;
                for(int j=1;j<count;j++){
                    result+=(count-j);
                }
                count = 0;
            } else{
                count++;
            }
        }
        result+=count;
        for(int j=1;j<count;j++){
            result+=(count-j);
        }
        return result;
    }
}