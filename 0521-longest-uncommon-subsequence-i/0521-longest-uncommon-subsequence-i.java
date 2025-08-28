class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)) return -1;
        int l1 = a.length();
        int l2 = b.length();
        return Math.max(l1,l2);
    }
}