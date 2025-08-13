class Solution {
    public int minSoldiers(int[] arr, int k) {
        // code here
        int length = arr.length;
        int requiredNo = (length+1)/2;
        int satisfied = 0;
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i: arr){
            if(i%k==0) satisfied++;
            else{
                lst.add(k-(i%k));
            }
        }
        if(satisfied==requiredNo) return 0;
        lst.sort((a,b) -> Integer.compare(a,b));
        int result = 0;
        for(int i=0;i<(requiredNo-satisfied);i++){
            result+=lst.get(i);
        }
        return result;
    }
}