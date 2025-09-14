class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList();
        }
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        int completeCount = 0;
        Set<Integer> visited = new HashSet();
        for (int vertex = 0; vertex < n ; vertex++) {
            if (visited.contains(vertex))
                continue;
            int[] componentInfo = new int[2];
            dfs(vertex, graph, visited, componentInfo);
            if (componentInfo[0] * (componentInfo[0] - 1) == componentInfo[1]) {
                completeCount++;
            }
        }
        return completeCount;

    }

    private void dfs(int vertex, List<Integer>[] graph, Set<Integer> visited, int[] componentInfo) {
        visited.add(vertex);
        componentInfo[0]++;
        componentInfo[1] += graph[vertex].size();

        for (int next : graph[vertex]) {
            if (!visited.contains(next)) {
                dfs(next, graph, visited, componentInfo);
            }
        }

    }
}