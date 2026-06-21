class Solution {
    public int[] twoSum(int[] nums, int target) {
        // better 
        HashMap<Integer, Integer> hash = new HashMap<>();
        var ans = new int[2];
        for (int i = 0; i<nums.length; i++) {
            hash.put(nums[i], i);
        }
        for (int j = 0; j<nums.length; j++) {
            var num2 = target - nums[j];
            if ((hash.containsKey(num2)) && (hash.get(num2)!= j)) {
                ans[0] = j;
                ans[1] = hash.get(num2);
                break;
            }
        }
        return ans;
    }
}
