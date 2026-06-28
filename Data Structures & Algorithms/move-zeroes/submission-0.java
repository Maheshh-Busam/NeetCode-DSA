class Solution {
    public void moveZeroes(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        for(int num : nums){
            if(num != 0){
                result[index++] = num;
            }
        }

        while(index < result.length){
            result[index++] = 0;
        }

        for(int i = 0 ; i < result.length; i++){
            nums[i] = result[i];
        }
    }
}