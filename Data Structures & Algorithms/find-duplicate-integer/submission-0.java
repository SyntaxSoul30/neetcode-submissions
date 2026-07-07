class Solution {
    public int findDuplicate(int[] nums) {
        var result = new int[10001];
        for (int i = 0; i<nums.length; i++) {
            result[nums[i]]++;
        }
        for (int i = 0; i<result.length; i++) {
            if(result[i]>1) return i;
        }
        return -1;
    }
}
