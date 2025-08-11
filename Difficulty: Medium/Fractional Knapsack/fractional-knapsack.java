import java.util.*;
class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        // code here
        List<List<Double>> lst = new ArrayList<>();
        for(int i=0;i<values.length;i++){
            lst.add(new ArrayList<>(Arrays.asList((double)values[i],(double)weights[i],(double)((double)weights[i]/(double)values[i]))));
        }
        Collections.sort(lst, new Comparator<List<Double>>(){
            public int compare(List<Double> a, List<Double> b){
                int firstCompare = Double.compare(a.get(2),b.get(2));
                if(firstCompare!=0) return firstCompare;
                return Double.compare(b.get(0),a.get(0));
            }
        });
        double result = 0;
        for(List<Double> temp: lst){
            if(temp.get(1)<=W){
                W-=temp.get(1);
                result+=temp.get(0);
            } else{
                if(W==0) break;
                else{
                    result+=((temp.get(0)/temp.get(1))*W);
                    W = 0;
                }
            }
        }
        return result;
    }
}