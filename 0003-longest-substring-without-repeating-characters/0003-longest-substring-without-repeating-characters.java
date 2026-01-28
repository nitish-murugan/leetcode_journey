class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            if(!set.contains(ch)){
                set.add(ch);
                maxLength = Math.max(maxLength, right-left+1);
            } else{
                while(left<=right){
                    char tempCh = s.charAt(left);
                    if(tempCh==ch){
                        left++;
                        break;
                    } else{
                        set.remove(tempCh);
                    }
                    left++;
                }
            }
        }
        return maxLength;
    }
}