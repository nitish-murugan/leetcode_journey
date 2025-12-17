class Solution {
    public static String kthPermutation(int n, int k) {
        // code here
        List<Integer> arr = new ArrayList<>();
        int fact = 1;
        String result = "";
        for(int i=1;i<n;i++){
            fact*=i;
            arr.add(i);
        }
        arr.add(n);
        k--;
        while(true){
            result+=String.valueOf(arr.get((k)/fact));
            arr.remove(k/fact);
            if(arr.size()==0) break;
            k = k%fact;
            fact = fact/arr.size();
        }
        return result;
    }
}
