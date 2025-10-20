class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String str: operations){
            char ch = str.charAt(0);
            if(ch=='+') x+=1;
            else if(ch=='-') x-=1;
            else if(ch=='X'){
                char ch1 = str.charAt(1);
                if(ch1=='+') x+=1;
                else x-=1;
            }
        }
        return x;
    }
}