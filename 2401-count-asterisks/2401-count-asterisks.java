class Solution {
    public int countAsterisks(String s) {
        int count = 0, length = s.length();
        boolean having = false;
        for(int i=0;i<length;i++){
            char ch = s.charAt(i);
            if(ch=='|') having=!having;
            if(!having && ch=='*') count++;
        }
        return count;
    }
}