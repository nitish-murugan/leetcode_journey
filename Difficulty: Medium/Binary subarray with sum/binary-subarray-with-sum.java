// User function Template for Java

class Solution {
    public int numberOfSubarrays(int[] arr, int target) {
        // code here
        int count = 0;
        int[] prefix = new int[arr.length];
        Map<Integer, Integer> map = new HashMap<>();
        int tempSum = 0;
        map.put(0, 1);
        for(int i=0;i<arr.length;i++){
            tempSum+=arr[i];
            prefix[i] = tempSum;
            count+=map.getOrDefault(prefix[i]-target, 0);
            map.put(prefix[i], map.getOrDefault(prefix[i],0)+1);
        }
        

        
        return count;
    }
}