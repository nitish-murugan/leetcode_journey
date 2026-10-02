class Solution {
    public void fn(List<String> lst, String temp, int left, int right, int n){
        if(left<n){
            temp+="(";
            fn(lst, temp, left+1, right, n);
            temp=temp.substring(0, temp.length()-1);
        }
        if(right<left){
            temp+=")";
            fn(lst, temp, left, right+1, n);
            temp=temp.substring(0, temp.length()-1);
        }
        if((left==n) && (right==n)){
            lst.add(temp);
            return;
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> lst = new ArrayList<>();
        fn(lst, "(", 1, 0, n);
        return lst;
    }
}