class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length-1];

        List<Integer> lst = new ArrayList<>();
        int index = 0;
        for(int i=min; i<=max;i++){
            if(nums[index]!=i){
                lst.add(i);
            } else{
                index++;
            }
        }
        
        return lst;
    }
}