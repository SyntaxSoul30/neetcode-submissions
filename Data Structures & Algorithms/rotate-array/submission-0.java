class Solution {
    public void rotate(int[] nums, int k) {
        // optimal -- size complexity
        var size = nums.length;
        k = k % size;
        reverse(nums, 0, size-1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, size - 1);
    }
    private void reverse(int nums[], int p1, int p2) {
        while (p1 < p2) {
            var temp = nums[p1];
            nums[p1] = nums[p2];
            nums[p2] = temp;
            p1++;
            p2--;
        }
    }
}