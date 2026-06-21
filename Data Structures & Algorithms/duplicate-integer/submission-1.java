class Solution {
    public boolean hasDuplicate(int[] nums) {
        // better

        var ans = false;
        Arrays.sort(nums);
        for (int i = 0; i<nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                ans = true;
            }
        }
        return ans;
    }
}