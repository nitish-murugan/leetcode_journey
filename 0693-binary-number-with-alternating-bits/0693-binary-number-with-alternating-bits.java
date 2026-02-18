class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean flag = true;
        int last = -1;
        while(n>0){
            if(flag){
                last = n%2;
                flag = false;
            } else{
                if(n%2 == last) return false;
                else last = n%2;
            }
            n/=2;
        }
        return true;
    }
}