class Solution {
    public int maxFreqSum(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int freq1 = 0;
        int freq2 = 0;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char ch: s.toCharArray()){
            if(set.contains(ch)){
                map1.put(ch,map1.getOrDefault(ch,0)+1);
                freq1 = Math.max(freq1,map1.get(ch));
            } else{
                map2.put(ch,map2.getOrDefault(ch,0)+1);
                freq2 = Math.max(freq2,map2.get(ch));
            }
        }
        return freq1+freq2;
    }
}