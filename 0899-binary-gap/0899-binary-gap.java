class Solution {
    public int binaryGap(int n) {
        boolean isOne = false;
        int result = 0;
        int count = 0;
        int one = 0;
        while(n>0){
            int rem = n%2;
            if(rem==1) one++;
            if(!isOne && rem==1){
                isOne=!isOne;
                count++;
            } else if(isOne && rem==1){
                result = Math.max(result, count);
                count = 1;
            } else if(isOne){
                count++;
            }

            n/=2;
        }
        return result;
    }
}