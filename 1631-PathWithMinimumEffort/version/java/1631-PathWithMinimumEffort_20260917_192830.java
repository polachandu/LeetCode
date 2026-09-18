// Last updated: 9/17/2026, 7:28:30 PM
1class Solution {
2    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
3        Map<Integer, List<int[]>> graph = new HashMap();
4        for (int[] flight : flights) {
5            graph.putIfAbsent(flight[0], new ArrayList());
6            graph.get(flight[0]).add(new int[] { flight[1], flight[2] });
7        }
8
9        int[] minStops = new int[n];
10        Arrays.fill(minStops, Integer.MAX_VALUE);
11
12        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
13        minHeap.add(new int[] { src, 0, 0 });
14
15        while (!minHeap.isEmpty()) {
16            int[] current = minHeap.poll();
17            int currentNode = current[0], currentCost = current[1], currentStops = current[2];
18            if (currentNode == dst) {
19                return currentCost;
20            }
21            if (currentStops > k) {
22                continue;
23            }
24            if (currentStops >= minStops[currentNode]) {
25                continue;
26            }
27            minStops[currentNode] = currentStops;
28            if (graph.containsKey(currentNode)) {
29                for (int[] edge : graph.get(currentNode)) {
30                    minHeap.add(new int[] { edge[0], edge[1] + currentCost, currentStops + 1 });
31                }
32            }
33        }
34        return -1;
35    }
36}