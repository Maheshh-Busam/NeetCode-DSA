class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int mostWaterContainer = 0;

        while(left <= right){

            int width = right - left;
            int currentContainer = width * Math.min(heights[left], heights[right]);

            mostWaterContainer = Math.max(currentContainer, mostWaterContainer);

            if(heights[left] < heights[right]){
                left++;
            }
            else {
                right--;
            }


        }
        return mostWaterContainer;
    }
}
