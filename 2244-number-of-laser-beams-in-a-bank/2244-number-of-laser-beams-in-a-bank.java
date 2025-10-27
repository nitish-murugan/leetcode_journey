class Solution {
    public int numberOfBeams(String[] bank) {
        int[] rows = new int[bank.length];
        int index=0;
        for(String str: bank){
            int count = 0;
            for(char i: str.toCharArray()){
                if(i=='1') count++;
            }
            rows[index++] = count;
        }
        int result = 0;
        boolean found = false;
        int lastIndex = 0;
        for(int i=0;i<index;i++){
            if(rows[i]!=0 && !found){
                found = true;
                lastIndex = i;
            } else if(found && rows[i]==0){
                continue;
            } else if(found && rows[i]!=0){
                result+=(rows[lastIndex]*rows[i]);
                i--;
                found = false;
            }
        }
        return result;
    }
}