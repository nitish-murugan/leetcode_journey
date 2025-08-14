class Solution {
    public String largestGoodInteger(String num) {
        String result = "";
        int maxVal = 0;
        int length = num.length();
        for(int i=0;i<=length-3;i++){
            char ch1 = num.charAt(i);
            char ch2 = num.charAt(i+1);
            char ch3 = num.charAt(i+2);
            if((ch1==ch2) && (ch2==ch3)){
                String tempStr = ch1+""+ch2+""+ch3;
                int tempNum = Integer.parseInt(tempStr);
                if(maxVal<=tempNum){
                    maxVal = tempNum;
                    result = tempStr;
                }
            }
        }
        return result;
    }
}