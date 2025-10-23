class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (n == 1)
            return true;
        Map<Integer, List<Integer>> roadMap = new HashMap();
        for (int[] edge : edges) {
            roadMap.computeIfAbsent(edge[0], k -> new ArrayList()).add(edge[1]);
            roadMap.computeIfAbsent(edge[1], k -> new ArrayList()).add(edge[0]);
        }

        boolean[] seen = new boolean[n];
        seen[source] = true;
        Queue<Integer> queue = new LinkedList();
        queue.offer(source);

        while (!queue.isEmpty()) {
            int currNode = queue.poll();
            if (currNode == destination) {
                return true;
            }

            for (int nextNode : roadMap.get(currNode)) {
                if (!seen[nextNode]) {
                    queue.offer(nextNode);
                    seen[nextNode] = true;
                }
            }
        }
        return false;
    }
}