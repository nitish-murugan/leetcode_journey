class Solution {
    public boolean palindrome(int i, int j, String str){
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public void fn(int i, String s, int length, List<List<String>> lst, List<String> temp){
        if(i == length){
            lst.add(new ArrayList<>(temp));
            return;
        }

        for(int j=i;j<length;j++){
            if(palindrome(i,j,s)){
                temp.add(s.substring(i,j+1));
                fn(j+1, s, length, lst, temp);
                temp.remove(temp.size()-1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> lst = new ArrayList<>();
        fn(0, s, s.length(), lst, new ArrayList<>());
        return lst;
    }
}