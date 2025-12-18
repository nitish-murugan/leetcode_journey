class Solution {
    public void fn(int[] nums, boolean[] arr, List<List<Integer>> lst, List<Integer> temp){
        if(temp.size() == nums.length){
            lst.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!arr[i]){
                temp.add(nums[i]);
                arr[i] = true;
                fn(nums,arr,lst,temp);
                temp.remove(temp.size()-1);
                arr[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        boolean[] arr = new boolean[nums.length];
        fn(nums,arr,lst,new ArrayList<>());
        return lst;
    }
}