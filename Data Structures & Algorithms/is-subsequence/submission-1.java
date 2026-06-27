class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }

        int p1 = 0, p2 = 0;
        int count = 0;

        while(p1 < s.length() && p2 < t.length()){
            if(s.charAt(p1) == t.charAt(p2)){
                count++;
                p1++;
            }
            p2++;
        }
        
        if(count != s.length()){
            return false;
        }
        return true;
    }
}