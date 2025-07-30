class Solution {
    public int arrangeCoins(int n) {
        int temp = 1;
        while(n>=temp){
            n-=temp;
            temp++;
        }
        return temp-1;
    }
}