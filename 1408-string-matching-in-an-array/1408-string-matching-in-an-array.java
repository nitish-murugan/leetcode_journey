class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> lst = new HashSet<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j){
                    if(words[i].contains(words[j])) lst.add(words[j]);
                }
            }
        }
        return new ArrayList<>(lst);
    }
}