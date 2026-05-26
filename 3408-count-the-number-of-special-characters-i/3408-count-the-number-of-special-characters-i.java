class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lower = new int[26];
        int[] upper = new int[26];
        int count = 0;

        for(char ch: word.toCharArray()){
            int index = -1;
            if(ch>='a' && ch<='z'){
                index = ch-'a';
                if(lower[index]==0){
                    lower[index] = 1;
                } else{
                    continue;
                }
            } else{
                index = ch-'A';
                if(upper[index]==0){
                    upper[index] = 1;
                } else{
                    continue;
                }
            }
            if(lower[index]==1 && upper[index]==1) count++;
        }
        return count;
    }
}