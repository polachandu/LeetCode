class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1)
            return intervals;
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        List<int[]> result = new ArrayList();
        result.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] prev = result.get(result.size() - 1);
            if (prev[1] >= intervals[i][0]) {
                prev[1] = Math.max(prev[1], intervals[i][1]);
            } else {
                result.add(intervals[i]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}