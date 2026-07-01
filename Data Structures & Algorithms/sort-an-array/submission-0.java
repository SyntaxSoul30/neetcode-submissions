class Solution {
    public int[] sortArray(int[] nums) {
        var max = 50000;
        var arr = new int[100001];
        for (int num : nums) {
            arr[num + max]++;
        }
        var index = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0) {
                nums[index++] = i - max;
                arr[i]--;
            }
        }
        return nums;
    }
}