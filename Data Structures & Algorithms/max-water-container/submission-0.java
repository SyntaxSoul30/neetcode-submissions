class Solution {
    public int maxArea(int[] heights) {
        var left = 0;
        var right = heights.length - 1;
        var mostWater = 0;
        while (left<right) {
            var length = right - left;
            var height = Math.min(heights[right], heights[left]);
            var currentWater = length * height;
            if (currentWater>mostWater) {
                mostWater = currentWater;
            }
            if (heights[left]<heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return mostWater;
    }
}
