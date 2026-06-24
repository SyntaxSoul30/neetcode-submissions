class Solution {
    public boolean hasDuplicate(int[] nums) {
        // optimal
        Set<Integer> hash = new HashSet<>();
        for (int i = 0; i<nums.length; i++) {
            if(hash.contains(nums[i])) {
                return true;
            }
            hash.add(nums[i]);
        }
        return false;
    }
}