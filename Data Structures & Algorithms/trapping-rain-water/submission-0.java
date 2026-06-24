class Solution {
    public int trap(int[] height) {
        var left = 0;
        var right = height.length - 1;
        var total = 0;
        var maxLeft = 0;
        var maxRight = 0;
        while (left<right) {
            if (height[left]<=height[right]) {
                if (height[left]>maxLeft) {
                    maxLeft = height[left];
                } else {
                    total = total + (maxLeft-height[left]);
                }
                left++;
            } else {
                if (height[right]>maxRight) {
                    maxRight = height[right];
                } else {
                    total = total + (maxRight-height[right]);
                }
                right--;
            }
        }
        return total;    
    }
}
