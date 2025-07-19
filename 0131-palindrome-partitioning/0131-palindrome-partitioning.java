class Solution {
    public void fn(String s, int i, List<List<String>> lst, List<String> temp){
        if(i==s.length()){
            lst.add(new ArrayList<>(temp));
            return;
        }

        for(int index=i;index<s.length();index++){
            if(isPalindrome(s,i,index)){
                temp.add(s.substring(i,index+1));
                fn(s,index+1,lst,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s, int i, int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> lst = new ArrayList<>();
        fn(s, 0, lst, new ArrayList<>());
        return lst;
    }
}