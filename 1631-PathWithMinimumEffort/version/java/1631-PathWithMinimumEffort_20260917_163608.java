// Last updated: 9/17/2026, 4:36:08 PM
1class Solution {
2    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
3
4        Map<Integer, List<int[]>> graph = new HashMap();
5        for (int[] flight : flights) {
6            graph.putIfAbsent(flight[0], new ArrayList());
7            graph.get(flight[0]).add(new int[] { flight[1], flight[2] });
8        }
9
10        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> (a[1] - b[1]));
11        minHeap.add(new int[] { src, 0, 0 });
12
13        int[] minStops = new int[n];
14        Arrays.fill(minStops, Integer.MAX_VALUE);
15
16        while (!minHeap.isEmpty()) {
17            int[] current = minHeap.poll();
18            int currentNode = current[0], currentWeight = current[1], currentStop = current[2];
19
20            if (currentNode == dst) {
21                return currentWeight;
22            }
23            if (currentStop > k) {
24                continue;
25            }
26            if (currentStop >= minStops[currentNode]) {
27                continue;
28            }
29            minStops[currentNode] = currentStop;
30
31            if (graph.containsKey(currentNode)) {
32                for (int[] edge : graph.get(currentNode)) {
33                    int nei = edge[0], neiWei = edge[1];
34                    int newWeight = currentWeight + neiWei;
35
36                    minHeap.add(new int[] { nei, newWeight, currentStop + 1 });
37                }
38            }
39        }
40        return -1;
41    }
42}