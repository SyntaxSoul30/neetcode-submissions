class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        var p1 = m-1;
        var p2 = n-1;
        var ctr = m+n-1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[ctr]=nums1[p1];
                p1--;
            } else {
                nums1[ctr]=nums2[p2];
                p2--;
            }
            ctr--;
        }
        while (p2 >= 0) {
            nums1[ctr] = nums2[p2];
            p2--;
            ctr--;
        }
    }
}