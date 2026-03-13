class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int temp = capacity;
        int length = plants.length;
        int steps = 0;
        for(int i=0;i<plants.length;i++){
            if(plants[i]<=capacity){
                capacity-=plants[i];
                steps++;
            } else{
                steps+=(2*i);
                steps++;
                capacity=(temp-plants[i]);

            }
        }
        return steps;
    }
}