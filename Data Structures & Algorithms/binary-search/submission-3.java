class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 1 && nums[0] == target) return 0;
        var left = 0;
        var right = nums.length - 1;
        while (left<=right) {
            var mid = (left + right)/2;
            if(nums[mid] == target) {
                return mid;
            } else if (nums[mid]<target) {
                left++;
            } else {
                right--;
            }

        }
        return -1;
    }
}
