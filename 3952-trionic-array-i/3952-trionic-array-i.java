class Solution {
    public boolean isTrionic(int[] nums) {
        boolean flag1=true, flag2=true, flag3=true;
        int count1=0, count2=0, count3=0;
        if(nums.length<=3) return false;
        for(int i=0;i<nums.length-1;i++){
            if(flag1){
                if(nums[i]<nums[i+1]){
                    count1++;
                    continue;
                }
                else{
                    flag1=false;
                    if(count1<1) return false;
                    i--;
                }
            } else if(flag2){
                if(nums[i]>nums[i+1]){
                    count2++;
                    continue;
                }
                else{
                    flag2=false;
                    if(count2<1) return false;
                    i--;
                }
            } else if(flag3){
                if(nums[i]<nums[i+1]){
                    count3++;
                    continue;
                }
                else{
                    flag3=false;
                    if(count3<1) return false;
                    i--;
                }
            } else {
                return false;
            }
        }
        return (!flag1 && !flag2 && count1 > 0 && count2 > 0 && count3 > 0);
    }
}