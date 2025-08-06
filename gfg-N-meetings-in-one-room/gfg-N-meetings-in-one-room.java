class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        int result = 0;
        for(int i=0;i<start.length;i++){
            lst.add(new ArrayList<>(Arrays.asList(start[i],end[i])));
        }
        lst.sort((a,b)->Integer.compare(a.get(1),b.get(1)));
        int lastMeeting = -1;
        int length = lst.size();
        for(int i=0;i<length;i++){
            if(lastMeeting<lst.get(i).get(0)){
                lastMeeting = lst.get(i).get(1);
                result++;
            }
        }
        return result;
    }
}
