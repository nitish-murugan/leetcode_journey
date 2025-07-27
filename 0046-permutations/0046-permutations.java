class Solution {
    public void fn(int[] nums, List<List<Integer>> lst, List<Integer> temp, boolean[] arr){
        if(temp.size() == nums.length){
            lst.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!arr[i]){
                temp.add(nums[i]);
                arr[i] = true;
                fn(nums,lst,temp,arr);
                temp.remove(temp.size()-1);
                arr[i] = false;
            }
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        boolean[] arr = new boolean[nums.length];
        Arrays.fill(arr,false);
        fn(nums,lst,new ArrayList<>(),arr);
        return lst;
    }
}