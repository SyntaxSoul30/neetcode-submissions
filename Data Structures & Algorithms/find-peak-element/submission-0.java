class Solution {
    public int findPeakElement(int[] nums) {
        if((nums.length == 1) || (nums[0]>nums[1])) return 0;
        if (nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
        var low = 1;
        var high = nums.length -2;
        while (low<=high) {
            var mid = low + (high-low)/2;
            if ((nums[mid]> nums[mid-1]) && (nums[mid]>nums[mid+1])) { 
                return mid;
            }
            if (nums[mid]<nums[mid+1]) {
                low = mid+1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}