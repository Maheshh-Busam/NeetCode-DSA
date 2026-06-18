class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left1 = 0, right1 = nums.length - 1;
        int[] result = new int[]{-1,-1};

        while(left1 <= right1){
            int mid = (left1 + right1) / 2;

            if(nums[mid] == target){
               result[0] = mid;
               right1 = mid - 1;
            }

            else if(nums[mid] < target){
                left1 = mid + 1;
            }
            else {
                right1 = mid - 1;
            }
        }

        int left2 = 0, right2 = nums.length - 1;
        while(left2 <= right2){
            int mid = (left2 + right2) / 2;

            if(nums[mid] == target){
                result[1] = mid;
                left2 = mid + 1;
            }
            else if(nums[mid] < target){
                left2 = mid + 1;
            }
            else {
                right2 = mid - 1;
            }
        }
        return result;
    }
    
}