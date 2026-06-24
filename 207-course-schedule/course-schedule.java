class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        List<List<Integer>> graph = new ArrayList();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList());
        }
        for (int[] pre : prerequisites) {
            indegree[pre[0]]++;
            graph.get(pre[1]).add(pre[0]);
        }

        Queue<Integer> queue = new LinkedList();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }
        int count = 0;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            count++;
            for (int nei : graph.get(curr)) {
                indegree[nei]--;
                if (indegree[nei] == 0) {
                    queue.add(nei);
                }
            }
        }
        return count == numCourses;
    }
}