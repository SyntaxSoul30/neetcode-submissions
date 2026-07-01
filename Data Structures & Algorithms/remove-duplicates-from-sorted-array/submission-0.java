class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        var ptr = 0;
        for(int i =1; i<nums.length; i++) {
            if(nums[ptr] != nums[i]) {
                ptr++;
                nums[ptr] = nums[i];
            }
        
        }
        return ptr+1;
    }
}