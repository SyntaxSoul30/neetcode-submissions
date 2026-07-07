class Solution {
    public void sortColors(int[] nums) {
        var left = 0; 
        var right = nums.length - 1;
        var mid = 0;
        while (mid<=right) {
            if (nums[mid] == 0) {
                var temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                left++;
                mid++;
            } else if (nums[mid] == 2) {
                var temp = nums[right];
                nums[right] = nums[mid];
                nums[mid] = temp;
                right--;
            } else {
                mid++;
            }
        }
        
    }
}