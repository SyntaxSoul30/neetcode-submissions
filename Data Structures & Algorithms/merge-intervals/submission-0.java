class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        var start = intervals[0][0];
        var end = intervals[0][1];
        List<int []> result = new ArrayList<>();
        for(int i=1; i<intervals.length; i++) {
            var start1 = intervals[i][0];
            var end1 = intervals[i][1];
            if (end>=start1) {
                start = start;
                end = Math.max(end, end1);
                continue;
            }
            result.add(new int[]{start,end});
            start = start1;
            end = end1;
        }
        result.add(new int[]{start,end});
        return result.toArray(new int[result.size()][]);
        
    }
}
