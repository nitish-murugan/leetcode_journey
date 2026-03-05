class Solution {
    public int minOperations(String s) {
        int length = s.length();
        int count1=0, count2=0;
        int flag=0;
        for(char ch: s.toCharArray()){
            int chInt = ch-'0';
            if(flag==chInt) count1++;
            flag=(flag+1)%2;
            if(flag==chInt) count2++;
        }
        return Math.min(count1, count2);
    }
}