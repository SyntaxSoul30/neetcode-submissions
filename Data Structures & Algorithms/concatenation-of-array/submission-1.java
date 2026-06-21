class Solution {
    public int[] getConcatenation(int[] nums) {
        var size = nums.length;
        var ans = new int[2 * size];
        for (int i=0; i<size; i++) {
            ans[i] = nums[i];
            ans[size+i] = nums[i];
        }
        return ans;
    }
}