class Solution {
    public int[] sortedSquares(int[] nums) {
        // optimal 2 pointer

        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                neg.add(0, nums[i]*nums[i]);
            } else {
                pos.add(nums[i]*nums[i]);
            }
        }
        var ptr1 = 0;
        var ptr2 = 0;
        var id = 0;
        var res = new int[nums.length];
        while (ptr1 < neg.size() && ptr2 < pos.size()) {
            if (neg.get(ptr1) < pos.get(ptr2)) {
                res[id] = neg.get(ptr1);
                ptr1++;
                id++;
            } else {
                res[id] = pos.get(ptr2);
                //  [ptr2];
                ptr2++;
                id++;
            }
        }
        while (ptr1 < neg.size()) {
            res[id] = neg.get(ptr1);
            ptr1++;
            id++;
        }
        while (ptr2 < pos.size()) {
            res[id] = pos.get(ptr2);
            ptr2++;
            id++;
        }
        return res;
    }
}