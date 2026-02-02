class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int count = -1;
        Set<Character> set = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            if(!set.contains(ch) && (set.size()+1)<=k){
                set.add(ch);
                map.put(ch, 1);
                if(set.size()==k) count = Math.max(count, (right-left+1));
            } else if(set.contains(ch)){
                if(set.size()==k) count = Math.max(count, (right-left+1));
                map.put(ch, map.get(ch)+1);
            } else{
                for(;left<=right;left++){
                    char temp = s.charAt(left);
                    map.put(temp, map.get(temp)-1);
                    if(map.get(temp)==0){
                        set.remove(temp);
                        map.remove(temp);
                        left++;
                        right--;
                        break;
                    }
                }
            }
            if(set.size()==k) count = Math.max(count, (right-left+1));
        }
        return count;
    }
}