class Solution {
    public void fn(int i, int[] nums, Set<List<Integer>> lst, List<Integer> temp){
        if(i == nums.length){
            lst.add(new ArrayList<>(temp));
            return;
        }

        
        temp.add(nums[i]);
        fn(i+1,nums,lst,temp);
        temp.remove(temp.size()-1);
        fn(i+1,nums,lst,temp);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> lst = new HashSet<>();
        fn(0,nums,lst,new ArrayList<>());
        List<List<Integer>> finalLst = new ArrayList<>();
        for(List<Integer> temp: lst){
            finalLst.add(new ArrayList<>(temp));
        }
        return finalLst;
    }
}