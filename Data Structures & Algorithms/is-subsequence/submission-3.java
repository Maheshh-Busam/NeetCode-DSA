class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()){
            return false;
        }

        int start = 0;

        for(int i = 0; i < s.length(); i++){
            boolean isExists = false;

            for(int j = start; j < t.length(); j++){
                if(s.charAt(i) == t.charAt(j)){
                    isExists = true;
                    start = j + 1;
                    break;
                }
            }
            if(!isExists){
                return false;
            }
        }
        return true;
    }
}