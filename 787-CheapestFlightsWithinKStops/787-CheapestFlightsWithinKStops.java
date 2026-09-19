// Last updated: 9/19/2026, 2:06:59 PM
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, List<int[]>> graph = new HashMap();
        for (int[] flight : flights) {
            graph.putIfAbsent(flight[0], new ArrayList());
            graph.get(flight[0]).add(new int[] { flight[1], flight[2] });
        }

        int[] minStops = new int[n];
        Arrays.fill(minStops, Integer.MAX_VALUE);

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        minHeap.add(new int[] { src, 0, 0 });

        while (!minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int currentNode = current[0], currentCost = current[1], currentStops = current[2];
            if (currentNode == dst) {
                return currentCost;
            }
            if (currentStops > k) {
                continue;
            }
            if (currentStops >= minStops[currentNode]) {
                continue;
            }
            minStops[currentNode] = currentStops;
            if (graph.containsKey(currentNode)) {
                for (int[] edge : graph.get(currentNode)) {
                    minHeap.add(new int[] { edge[0], edge[1] + currentCost, currentStops + 1 });
                }
            }
        }
        return -1;
    }
}