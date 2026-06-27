class Solution {
    public int maxArea(int[] heights) {
        int mostWaterContainer = 0;

        for(int i = 0; i < heights.length; i++){
            for(int j = i + 1; j < heights.length; j++){
                
                int width = j - i;
                int currentContainer = width * Math.min(heights[i], heights[j]);

                mostWaterContainer = Math.max(currentContainer, mostWaterContainer);
            }
        }
        return mostWaterContainer;
    }
}
