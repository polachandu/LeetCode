// Last updated: 10/11/2026, 4:28:00 PM
1class Solution {
2    public int minCostConnectPoints(int[][] points) {
3        int n = points.length;
4        int count = 0, result = 0;
5        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
6        boolean[] visited = new boolean[n];
7        heap.add(new int[] { 0, 0 });
8
9        while (count < n) {
10            int[] curr = heap.poll();
11            int cost = curr[0], node = curr[1];
12            if (visited[node])
13                continue;
14            visited[node] = true;
15            result += cost;
16            count++;
17
18            for (int j = 0; j < n; j++) {
19                if (!visited[j]) {
20                    int d = Math.abs(points[j][0] - points[node][0]) + Math.abs(points[j][1] - points[node][1]);
21                    heap.add(new int[] { d, j });
22                }
23            }
24        }
25        return result;
26    }
27}