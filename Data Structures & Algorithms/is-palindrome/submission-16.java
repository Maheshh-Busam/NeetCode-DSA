class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }

        return isPalindrome(sb);
    }

    public boolean isPalindrome(StringBuilder sb){
        int left = 0, right = sb.length() - 1;

        while(left <= right){
            if(sb.charAt(left) != sb.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
