class Solution {
    public int smallestNumber(int n) {
        int i;
        for(i=0;(int)Math.pow(2,i)<=n;i++);
        return ((int)Math.pow(2,i))-1;
    }
}