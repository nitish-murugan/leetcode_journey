class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lst = new ArrayList<>();
        if(numRows==1){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            lst.add(temp);
            return lst;
        }
        if(numRows==2){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            lst.add(new ArrayList<>(temp));
            temp.clear();
            temp.add(1);
            temp.add(1);
            lst.add(new ArrayList<>(temp));
            return lst;
        }

        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        lst.add(new ArrayList<>(temp));

        temp.clear();
        temp.add(1);
        temp.add(1);
        lst.add(new ArrayList<>(temp));

        for(int i=2;i<numRows;i++){
            temp.clear();
            temp.add(1);
            for(int j=0;j<i-1;j++){
                temp.add(lst.get(i-1).get(j)+lst.get(i-1).get(j+1));
            }
            temp.add(1);
            lst.add(new ArrayList<>(temp));
        }

        return lst;
    }
}