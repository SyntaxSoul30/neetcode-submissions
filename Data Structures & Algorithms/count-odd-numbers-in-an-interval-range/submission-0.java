class Solution {
    public int countOdds(int low, int high) {
        var ctr = 0;
        while (low <= high) {
            if (low % 2 != 0) {
                ctr++;
            }
            low++;
        }
        return ctr;
    }
}