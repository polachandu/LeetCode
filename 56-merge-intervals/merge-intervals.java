class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        result.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] previous = result.get(result.size() - 1);
            if (previous[1] >= intervals[i][0]) {
                previous[1] = Math.max(previous[1], intervals[i][1]);
            } else {
                result.add(intervals[i]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}