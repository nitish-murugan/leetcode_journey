class Solution {
    public void fn(int i, int[] candidates, int target, Set<List<Integer>> lst, List<Integer> temp){
        if(target == 0){
            lst.add(new ArrayList<>(temp));
            return;
        }
        
        for(int j=i;j<candidates.length;j++){
            if(j>i && candidates[j]==candidates[j-1]) continue;
            if(candidates[j]>target) break;
            temp.add(candidates[j]);
            fn(j+1, candidates, target-candidates[j], lst, temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> lst = new HashSet<>();
        fn(0, candidates, target, lst, new ArrayList<>());
        List<List<Integer>> finalLst = new ArrayList<>();
        for(List<Integer> temp: lst){
            finalLst.add(new ArrayList<>(temp));
        }
        return finalLst;
    }
}