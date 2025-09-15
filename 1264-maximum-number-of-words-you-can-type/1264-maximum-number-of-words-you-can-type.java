class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<brokenLetters.length();i++) set.add(brokenLetters.charAt(i));
        int count = 0;
        for(String str: text.split(" ")){
            boolean flag = true;
            int length = str.length();
            for(int i=0;i<length;i++){
                if(set.contains(str.charAt(i))){
                    flag = false;
                    break;
                }
            }
            count = flag?count+1:count;
        }
        return count;
    }
}