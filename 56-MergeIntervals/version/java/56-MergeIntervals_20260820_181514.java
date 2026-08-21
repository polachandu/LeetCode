// Last updated: 8/20/2026, 6:15:14 PM
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        List<int[]> results = new ArrayList();
4        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
5        results.add(intervals[0]);
6
7        for (int i = 1; i < intervals.length; i++) {
8            int[] prev = results.get(results.size() - 1);
9            if (intervals[i][0] <= prev[1]) {
10                prev[1] = Math.max(prev[1], intervals[i][1]);
11            } else {
12                results.add(intervals[i]);
13            }
14        }
15        return results.toArray(new int[results.size()][]);
16    }
17}