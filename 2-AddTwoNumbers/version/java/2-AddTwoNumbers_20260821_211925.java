// Last updated: 8/21/2026, 9:19:25 PM
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> graph = new ArrayList();
4        for (int i = 0; i < numCourses; i++) {
5            graph.add(new ArrayList());
6        }
7        int[] indegree = new int[numCourses];
8
9        for (int[] pre : prerequisites) {
10            graph.get(pre[1]).add(pre[0]);
11            indegree[pre[0]]++;
12        }
13        Queue<Integer> queue = new LinkedList();
14        for (int i = 0; i < numCourses; i++) {
15            if (indegree[i] == 0) {
16                queue.add(i);
17            }
18        }
19        int count = 0;
20        while (!queue.isEmpty()) {
21            int current = queue.poll();
22            count++;
23            List<Integer> neighbors = graph.get(current);
24            for (int nei : neighbors) {
25                indegree[nei]--;
26                if (indegree[nei] == 0) {
27                    queue.add(nei);
28                }
29            }
30        }
31        return count == numCourses;
32    }
33}