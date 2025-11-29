class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int length = s.length();
        boolean flag = false;
        for(int i=length-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch != ' '){
                flag = true;
                count++;
            } else if(flag){
                return count;
            }
        }
        return count;
    }
}