public class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (i > 1 && sb.charAt(sb.length() - 1) == sb.charAt(sb.length() - 2) && s.charAt(i) == sb.charAt(sb.length() - 1)) {
                sb.deleteCharAt(sb.length() - 1); 
            }
            sb.append(s.charAt(i)); 
        }
        
        return sb.toString();
    }
}
