class Solution {
    public int searchInsert(int[] nums, int target) {
        var low = 0;
        var high = nums.length;
        while (low<high) {
            var mid = (low+high)/2;
            if(nums[mid]<target) {
                low = mid+1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}