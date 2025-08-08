class Solution {

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        int[] result = new int[2];
        result[0] = 0;
        result[1] = 0;
        int maxDeadline = -1;
        for(int i=0;i<deadline.length;i++){
            lst.add(new ArrayList<>(Arrays.asList(deadline[i], profit[i])));
            maxDeadline = Math.max(maxDeadline,deadline[i]);
        }
        lst.sort((a,b)->Integer.compare(b.get(1), a.get(1)));
        int[] arr = new int[maxDeadline];
        Arrays.fill(arr,-1);
        for(ArrayList<Integer> temp: lst){
            int deadLine = temp.get(0);
            int prof = temp.get(1);
            
            for(int i=deadLine-1;i>=0;i--){
                if(arr[i] == -1){
                    arr[i] = 1;
                    result[1]+=prof;
                    result[0]++;
                    break;
                }
            }
        }
        ArrayList<Integer> lstNew = new ArrayList<>();
        lstNew.add(result[0]);
        lstNew.add(result[1]);
        return lstNew;
    }
}