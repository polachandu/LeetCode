// Last updated: 8/12/2026, 11:16:20 AM
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] topologicalOrder = new int[numCourses];
        int[] indegree = new int[numCourses];
        Map<Integer, List<Integer>> adjList = new HashMap<Integer, List<Integer>>();

        for (int i = 0; i < prerequisites.length; i++) {
            int dest = prerequisites[i][0];
            int src = prerequisites[i][1];
            List<Integer> lst = adjList.getOrDefault(
                    src,
                    new ArrayList<Integer>());
            lst.add(dest);
            adjList.put(src, lst);
            indegree[dest]++;
        }

        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        int j = 0;
        while (!q.isEmpty()) {
            int node = q.remove();
            topologicalOrder[j++] = node;

            if (adjList.containsKey(node)) {
                for (Integer neighbor : adjList.get(node)) {
                    indegree[neighbor]--;

                    if (indegree[neighbor] == 0) {
                        q.add(neighbor);
                    }
                }
            }
        }

        if (j == numCourses) {
            return topologicalOrder;
        }

        return new int[0];
    }

}