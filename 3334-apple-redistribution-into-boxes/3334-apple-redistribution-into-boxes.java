class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for(int i: apple) sum+=i;
        Arrays.sort(capacity);
        for (int i = 0; i < capacity.length / 2; i++) {
            int temp = capacity[i];
            capacity[i] = capacity[capacity.length - 1 - i];
            capacity[capacity.length - 1 - i] = temp;
        }

        int count = 0;
        for(int i: capacity){
            if(sum>0){
                count++;
                sum-=i;
            } else{
                break;
            }
        }

        return count;
    }
}