class Solution {
    public int trap(int[] height) {
        int maxArea = 0;

        for(int i = 0; i < height.length; i++){
            int leftMax = max(0, i, height);
            int rightMax = max(i, height.length - 1, height);

            maxArea += Math.min(leftMax, rightMax) - height[i];
        }
        return maxArea;
    }

    public int max(int start, int end, int[] height){
        int max = Integer.MIN_VALUE;

        while(start <= end){
            if(height[start] > max){
                max = height[start];
            }
            start++;
        }
        return max;
    }
}
