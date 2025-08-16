class Solution {
    public int maximum69Number (int num) {
        StringBuilder strNum = new StringBuilder(String.valueOf(num));
        int length = strNum.length();
        for(int i=0;i<length;i++){
            char ch = strNum.charAt(i);
            if(ch == '6'){
                strNum.replace(i,i+1,"9");
                return Integer.parseInt(strNum.toString());
            }
        }
        return num;
    }
}