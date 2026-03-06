class Solution {
    public boolean checkOnesSegment(String s) {
        int count = 0;
        int tempCount = 0;
        int length = s.length();
        s+='0';
        for(int i=0;i<length;i++){
            char ch = s.charAt(i);
            if(ch=='1'){
                if(count==0) tempCount++;
                count++;
            }
            else count = 0;
        }
        System.out.println(tempCount);
        if(s.charAt(s.length()-1)=='1') tempCount++;
        return (tempCount==1)?true:false;
    }
}