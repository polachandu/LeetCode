class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int[] prevEnd = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < prevEnd[1]) {
                count++;
            } else {
                prevEnd = intervals[i];
            }
        }
        return count;
    }
}