class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int[] result = new int[]{-1,-1};

        while(left < nums.length){
            if(nums[left] == target){
                result[0] = left;
                break;
            }
            left++;
        }

        while(right >= 0){
            if(nums[right] == target){
                result[1] = right;
                break;
            }
            right--;
        }

        return result;
    }
}