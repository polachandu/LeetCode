// Last updated: 10/26/2026, 6:21:27 PM
1class Solution {
2    public int[][] kClosest(int[][] points, int k) {
3        int[][] results = new int[k][2];
4        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b[0] * b[0] + b[1] * b[1],
5                a[0] * a[0] + a[1] * a[1]));
6        for (int[] point : points) {
7            maxHeap.offer(point);
8            if (maxHeap.size() > k) {
9                maxHeap.poll();
10            }
11        }
12        for (int i = 0; i < k; i++) {
13            int[] current = maxHeap.poll();
14            results[i][0] = current[0];
15            results[i][1] = current[1];
16        }
17        return results;
18    }
19}