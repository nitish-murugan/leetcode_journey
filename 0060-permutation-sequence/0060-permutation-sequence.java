class Solution {
    public String getPermutation(int n, int k) {
        String result = "";
        List<Integer> arr = new ArrayList<>();
        int fact = 1;
        for(int i=1;i<n;i++){
            arr.add(i);
            fact*=i;
        }
        arr.add(n);
        k--;
        while(true){
            result+=String.valueOf(arr.get((k)/fact));
            arr.remove((k)/fact);
            if(arr.size()==0) break;
            k =k%fact;
            fact = fact/arr.size();
        }
        return result;
    }
}