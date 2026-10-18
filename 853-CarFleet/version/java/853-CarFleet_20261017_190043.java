// Last updated: 10/17/2026, 7:00:43 PM
1class Solution {
2    public int carFleet(int target, int[] position, int[] speed) {
3        int n = position.length;
4        int result = 1;
5        double[][] time = new double[n][2];
6        for (int i = 0; i < n; i++) {
7            time[i][0] = position[i];
8            time[i][1] = (double) (target - position[i]) / speed[i];
9        }
10        Arrays.sort(time, (a, b) -> Double.compare(b[0], a[0]));
11        double maxSoFar = time[0][1];
12        for (int i = 1; i < n; i++) {
13            if (maxSoFar < time[i][1]) {
14                result++;
15                maxSoFar = time[i][1];
16            }
17
18        }
19        return result;
20    }
21}