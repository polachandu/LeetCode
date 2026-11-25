// Last updated: 11/25/2026, 1:15:58 PM
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
4        List<int[]> result = new ArrayList();
5        result.add(intervals[0]);
6        for (int i = 1; i < intervals.length; i++) {
7            int[] last = result.get(result.size() - 1);
8            if (last[1] >= intervals[i][0]) {
9                last[1] = Math.max(last[1], intervals[i][1]);
10            } else {
11                result.add(intervals[i]);
12            }
13        }
14        return result.toArray(new int[result.size()][]);
15    }
16}