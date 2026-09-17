// Last updated: 9/17/2026, 3:09:05 PM
1class Solution {
2    public int networkDelayTime(int[][] times, int n, int k) {
3        int[] dist = new int[n + 1];
4        Arrays.fill(dist, Integer.MAX_VALUE);
5        boolean[] visited = new boolean[n + 1];
6        int minDelay = Integer.MIN_VALUE;
7
8        Map<Integer, List<int[]>> graph = new HashMap();
9        for (int[] time : times) {
10            graph.putIfAbsent(time[0], new ArrayList());
11            graph.get(time[0]).add(new int[] { time[1], time[2] });
12        }
13
14        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> (a[1] - b[1]));
15        dist[k] = 0;
16        minHeap.add(new int[] { k, 0 });
17
18        while (!minHeap.isEmpty()) {
19            int[] current = minHeap.poll();
20            int currentNode = current[0], currentDist = current[1];
21
22            if (visited[currentNode]) {
23                continue;
24            }
25            visited[currentNode] = true;
26
27            if (graph.containsKey(currentNode)) {
28                for (int[] edge : graph.get(currentNode)) {
29                    int nei = edge[0], currentWeight = edge[1];
30                    int newWeight = currentWeight + currentDist;
31                    if (newWeight < dist[nei]) {
32                        dist[nei] = newWeight;
33                        minHeap.add(new int[] { nei, newWeight });
34                    }
35                }
36            }
37        }
38        for (int i = 1; i < dist.length; i++) {
39            if (dist[i] == Integer.MAX_VALUE) {
40                return -1;
41            } else {
42                minDelay = Math.max(dist[i], minDelay);
43            }
44        }
45        return minDelay;
46    }
47}