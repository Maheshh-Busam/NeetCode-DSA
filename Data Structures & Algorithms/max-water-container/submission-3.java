class Solution {
    public int maxArea(int[] heights) {
        int p1 = 0, p2 = heights.length - 1;
        int maxWaterContainer = 0;

        while(p1 <= p2){

            int width = p2 - p1;
            int currWaterContainer = width * Math.min(heights[p2], heights[p1]);
            maxWaterContainer = Math.max(maxWaterContainer, currWaterContainer);

            if(heights[p1] < heights[p2]){
                p1++;
            }
            else{
                p2--;
            }
        }
        return maxWaterContainer;
    }
}
