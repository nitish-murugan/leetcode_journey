class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lst = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int length = nums.length;
        for(int i=0;i<length;i++){
            int j=i+1;
            int k=length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    set.add(new ArrayList<>(temp));
                    j++;
                    k--;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        for(List<Integer> i: set){
            lst.add(new ArrayList<>(i));
        }
        return lst;
    }
}