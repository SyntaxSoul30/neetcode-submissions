class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        var end = intervals[0][1];
        var ctr = 0;
        for(int i=1; i<intervals.length; i++) {
            var start1 = intervals[i][0];
            var end1 = intervals[i][1];
            if (end>start1) {
                end = Math.min(end, end1);
                ctr++;
                continue;
            }
            end = end1;
        }
        return ctr;
    }
}
