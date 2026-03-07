class Solution {
    public void fn(int[] arr, int i, Set<List<Integer>> lst, List<Integer> temp){
        if(i==arr.length){
            lst.add(new ArrayList<>(temp));
            return;
        }
        for(int j=i;j<arr.length;j++){
            temp.add(arr[j]);
            lst.add(new ArrayList<>(temp));
            fn(arr,j+1,lst,temp);
            temp.remove(temp.size()-1);
        }

    }
    public List<List<Integer>> subsets(int[] nums) {
        Set<List<Integer>> lst = new HashSet<>();
        lst.add(new ArrayList<>());
        fn(nums, 0, lst, new ArrayList<>());
        return new ArrayList<>(lst);
    }
}