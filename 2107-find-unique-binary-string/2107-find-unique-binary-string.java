class Solution {
    public boolean isThere(String[] nums, String str){
        for(String i: nums) if(i.equals(str)) return true;
        return false;
    }
    public String inc(String str){
        char[] bin = str.toCharArray();
        char carry = '0';
        for(int i=bin.length-1;i>=0;i--){
            if(i==bin.length-1){
                if(bin[i]=='1'){
                    bin[i]='0';
                    carry='1';
                } else{
                    bin[i] = '1';
                    return String.valueOf(bin);
                }
            } else{
                if(bin[i]=='1'){
                    if(carry=='1'){
                        bin[i] = '0';
                        carry='1';
                    } else{
                        return String.valueOf(bin);
                    }
                } else{
                    if(carry=='1'){
                        bin[i] = '1';
                    }
                    return String.valueOf(bin);
                }
            }
        }
        return String.valueOf(bin);
    }
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        String start = "";
        for(int i=0;i<n;i++) start+="0";
        for(int i=0;i<(int)Math.pow(2,n)-1;i++){
            if(!isThere(nums, start)) return start;
            start = inc(start);
        }
        return start;
    }
}