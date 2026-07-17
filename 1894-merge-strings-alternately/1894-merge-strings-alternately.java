class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int l1 = word1.length(), l2 = word2.length();
        int min = Math.min(l1,l2);
        for(int i=0;i<min;i++){
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }

        if(min!=l1){
            for(int i=min;i<l1;i++) result.append(word1.charAt(i));
        } else{
            for(int i=min;i<l2;i++) result.append(word2.charAt(i));
        }
        return result.toString();
    }
}