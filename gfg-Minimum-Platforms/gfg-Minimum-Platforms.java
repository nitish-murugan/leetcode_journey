// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        List<List<Integer>> lst = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            lst.add(new ArrayList<>(Arrays.asList(arr[i],dep[i])));
        }
        lst.sort((a,b)-> Integer.compare(a.get(0),b.get(0)));
        int maxPlatform = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(List<Integer> temp: lst){
            int arrival = temp.get(0);
            int dept = temp.get(1);
            
            while(!q.isEmpty() && q.peek()<arrival){
                q.poll();
            }
            q.add(dept);
            maxPlatform = Math.max(maxPlatform, q.size());
        }
        return maxPlatform;
    }
}
