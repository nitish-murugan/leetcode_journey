class Solution {
    public int sumFn(int start, int end){
        int sum1 = (end*(end+1))/2;
        start--;
        int sum2 = (start*(start+1))/2;
        return sum1-sum2;
    }
    public int totalMoney(int n) {
        int sum = 0;
        int start=1;
        while(n!=0){
            if(n>=7){
                sum+=sumFn(start,start+6);
                start+=1;
                n-=7;
            } else{
                sum+=sumFn(start,start+n-1);
                n=0;
            }
        }
        return sum;
    }
}