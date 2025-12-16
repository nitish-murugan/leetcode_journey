class Solution {
    public void fn(int i, int[] candidates, int target, List<List<Integer>> lst, List<Integer> temp){
        if(i == candidates.length){
            if(target == 0){
                lst.add(new ArrayList<>(temp));
            }
            return;
        }
        if(target == 0){
            lst.add(new ArrayList<>(temp));
            return;
        }
        if(candidates[i]<=target){
            temp.add(candidates[i]);
            fn(i, candidates, target-candidates[i], lst, temp);
            temp.remove(temp.size()-1);
        }
        if(i<candidates.length){
            fn(i+1, candidates, target, lst, temp);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lst = new ArrayList<>();
        fn(0, candidates, target, lst, new ArrayList<>());
        return lst;
    }
}