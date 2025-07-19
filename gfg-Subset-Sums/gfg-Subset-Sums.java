 User function Template for JavaUser function Template for Java
class Solution {
    public void fn(int i, int n, int[] arr, int sum, ArrayListInteger lst){
        if(i==n){
            lst.add(sum);
            return;
        }
        fn(i+1,n,arr,sum+arr[i],lst); pick;
        fn(i+1,n,arr,sum,lst); not pick
        
    }
    public ArrayListInteger subsetSums(int[] arr) {
         code here
        ArrayListInteger lst = new ArrayList();
        fn(0,arr.length,arr,0,lst);
        return lst;
    }
}