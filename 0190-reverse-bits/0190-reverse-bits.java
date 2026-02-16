class Solution {
    public int reverseBits(int n) {
        String bin = "";
        int size=0;
        while(size<32) {
            bin+=String.valueOf(n % 2);
            n/=2;
            size++;
        }

        int result = 0;
        for(char i: bin.toCharArray()){
            result+=(int)(Math.pow(2, size-1)*(i-'0'));
            size--;
        }
        return result;
    }
}