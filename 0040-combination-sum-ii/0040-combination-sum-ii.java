class Solution {
    public void fn(int i, int[] arr, int target, List<List<Integer>> lst, List<Integer> temp) {
        if (target == 0) {
            lst.add(new ArrayList<>(temp));
            return;
        }
        for (int j = i; j < arr.length; j++) {
            if (j > i && arr[j] == arr[j - 1]) continue;
            if (arr[j] > target) break; 
            temp.add(arr[j]);
            fn(j + 1, arr, target - arr[j], lst, temp);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> lst = new ArrayList<>();
        Arrays.sort(candidates); 
        fn(0, candidates, target, lst, new ArrayList<>());
        return lst;
    }
}
