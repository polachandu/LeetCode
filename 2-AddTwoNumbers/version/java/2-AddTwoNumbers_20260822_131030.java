// Last updated: 8/22/2026, 1:10:30 PM
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        int count = 0;
4        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
5        int prevEnd = intervals[0][1];
6        for (int i = 1; i < intervals.length; i++) {
7            if (prevEnd > intervals[i][0]) {
8                count++;
9            } else {
10                prevEnd = intervals[i][1];
11            }
12        }
13        return count;
14    }
15}