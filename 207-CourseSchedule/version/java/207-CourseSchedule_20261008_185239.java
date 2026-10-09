// Last updated: 10/8/2026, 6:52:39 PM
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        int[] indegree = new int[numCourses];
4        List<List<Integer>> graph = new ArrayList();
5        for (int i = 0; i < numCourses; i++) {
6            graph.add(new ArrayList());
7        }
8        for (int[] preq : prerequisites) {
9            graph.get(preq[1]).add(preq[0]);
10            indegree[preq[0]]++;
11        }
12        Queue<Integer> queue = new LinkedList();
13        for (int i = 0; i < numCourses; i++) {
14            if (indegree[i] == 0) {
15                queue.add(i);
16            }
17        }
18        int count = 0;
19        while (!queue.isEmpty()) {
20            int current = queue.poll();
21            count++;
22            for (int nei : graph.get(current)) {
23                indegree[nei]--;
24                if (indegree[nei] == 0) {
25                    queue.add(nei);
26                }
27            }
28        }
29
30        return count == numCourses;
31    }
32}