class Solution {
    public int totalFruit(int[] fruits) {
        int finalVal = 0;
        int left = 0;
        List<Integer> lst = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int right=0;right<fruits.length;right++){
            int val = fruits[right];
            if(!lst.contains(val) && (lst.size()+1)<=2){
                lst.add(val);
                map.put(val, 1);
            } else if(lst.contains(val)){
                map.put(val, map.get(val)+1);
            } else{
                for(;left<=right;left++){
                    int tempVal = fruits[left];
                    map.put(tempVal, map.get(tempVal)-1);
                    if(map.get(tempVal)==0){
                        lst.remove(Integer.valueOf(tempVal));
                        map.remove(tempVal);
                        left++;
                        right--;
                        break;
                    }
                }
            }


            finalVal = Math.max(finalVal, (right-left+1));
        }
        return finalVal;
    }
}