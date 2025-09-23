class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        int l1 = v1.length;
        String[] v2 = version2.split("\\.");
        int l2 = v2.length;
        int i=0,j=0;
        while(i<l1 && j<l2){
            int s1=Integer.parseInt(v1[i]), s2=Integer.parseInt(v2[j]);
            if(s1>s2) return 1;
            else if(s1<s2) return -1;
            i++;
            j++;
        }
        while(i<l1){
            int s1=Integer.parseInt(v1[i]);
            if(s1>0) return 1;
            i++;
        }
        while(j<l2){
            int s1=Integer.parseInt(v2[j]);
            if(s1>0) return -1;
            j++;
        }
        return 0;
    }
}