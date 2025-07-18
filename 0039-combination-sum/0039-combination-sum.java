class Solution {
    public void fn(int i, int[] candidate, int target, List<List<Integer>> arr, List<Integer> temp){
        if(i==candidate.length){
            if(target==0){
                arr.add(new ArrayList<>(temp));
            }
            return;
        }
        if(candidate[i]<=target){
            temp.add(candidate[i]);
            fn(i,candidate,target-candidate[i],arr,temp);
            temp.remove(temp.size()-1);
        }
        fn(i+1,candidate,target,arr,temp);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lst = new ArrayList<>();
        fn(0,candidates,target,lst,new ArrayList<>());
        return lst;
    }
}