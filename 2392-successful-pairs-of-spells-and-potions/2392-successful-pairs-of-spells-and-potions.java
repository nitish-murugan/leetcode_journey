class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int length = potions.length;
        int[] arr = new int[spells.length];
        int index = 0;
        for(int num: spells){
            if((long)num*potions[length-1]<success){
                index++;
                continue;
            }
            int low=0, high=length-1;
            while(low<=high){
                int mid = (low+high)/2;
                if((long)num*potions[mid]>=success){
                    high = mid-1;
                } else{
                    low = mid+1;
                }
            }
            arr[index++] = length-low;
        }
        return arr;
    }
}