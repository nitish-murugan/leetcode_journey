class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        if(piles.length == h) return piles[piles.length-1];
        int low = 1;
        int high = piles[piles.length-1];
        int result = Integer.MAX_VALUE;
        while(low<high){
            int mid = (int)((low+high)/2);
            int count = 0;
            for(int i: piles){
                if(i<=mid) count++;
                else{
                    count+=(int)(i/mid);
                    if(i%mid!=0) count++;
                }
            }
            if(count<=h) high = mid;
            else low = mid+1;
        }
        return low;
    }
}