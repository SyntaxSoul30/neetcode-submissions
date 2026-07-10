class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        var counter = 0;
        var maxCnt = 0;
        for (int i =0; i< nums.length; i++) {
            if(nums[i] == 1) {
                counter++;
                maxCnt = Math.max(counter, maxCnt);
            } else {
                maxCnt = Math.max(counter, maxCnt);
                counter = 0;
            }
        }
        return maxCnt;
        
    }
}