class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });
        List<List<Integer>> lst = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=start && intervals[i][0]<=end){
                if(intervals[i][1]>=end){
                    end = intervals[i][1];
                }
            } else{
                lst.add(new ArrayList<>(Arrays.asList(start, end)));
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        lst.add(new ArrayList<>(Arrays.asList(start, end)));

        int[][] result = new int[lst.size()][2];
        int index = 0;
        for(List<Integer> l: lst){
            result[index][0] = l.get(0);
            result[index++][1] = l.get(1);
        }
        return result;
    }
}