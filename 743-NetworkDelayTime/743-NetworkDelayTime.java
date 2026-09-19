// Last updated: 9/19/2026, 2:07:08 PM
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        boolean[] visited = new boolean[n + 1];
        int minDelay = Integer.MIN_VALUE;

        Map<Integer, List<int[]>> graph = new HashMap();
        for (int[] time : times) {
            graph.putIfAbsent(time[0], new ArrayList());
            graph.get(time[0]).add(new int[] { time[1], time[2] });
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> (a[1] - b[1]));
        dist[k] = 0;
        minHeap.add(new int[] { k, 0 });

        while (!minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int currentNode = current[0], currentDist = current[1];

            if (visited[currentNode]) {
                continue;
            }
            visited[currentNode] = true;

            if (graph.containsKey(currentNode)) {
                for (int[] edge : graph.get(currentNode)) {
                    int nei = edge[0], currentWeight = edge[1];
                    int newWeight = currentWeight + currentDist;
                    if (newWeight < dist[nei]) {
                        dist[nei] = newWeight;
                        minHeap.add(new int[] { nei, newWeight });
                    }
                }
            }
        }
        for (int i = 1; i < dist.length; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                return -1;
            } else {
                minDelay = Math.max(dist[i], minDelay);
            }
        }
        return minDelay;
    }
}