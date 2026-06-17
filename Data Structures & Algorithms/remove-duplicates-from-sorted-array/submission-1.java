class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }

        int left = 0, right = 0;

        while(right < n){
            nums[left] = nums[right];

            while(right < n && nums[left] == nums[right]){
                right++;
            }
            left++;
        }
        return left;
    }
}