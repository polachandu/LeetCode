// Last updated: 9/9/2026, 12:21:23 PM
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        if (prerequisites.length == 0) {
4            return true;
5        }
6        List<List<Integer>> graph = new ArrayList();
7        int[] indegree = new int[numCourses];
8        for (int i = 0; i < numCourses; i++) {
9            graph.add(new ArrayList());
10        }
11        for (int[] preq : prerequisites) {
12            graph.get(preq[1]).add(preq[0]);
13            indegree[preq[0]]++;
14        }
15
16        Queue<Integer> queue = new LinkedList();
17        for (int i = 0; i < numCourses; i++) {
18            if (indegree[i] == 0) {
19                queue.add(i);
20            }
21        }
22        int seen = 0;
23        while (!queue.isEmpty()) {
24            int curr = queue.poll();
25            seen++;
26            for (int nei : graph.get(curr)) {
27                indegree[nei]--;
28                if (indegree[nei] == 0) {
29                    queue.add(nei);
30                }
31            }
32        }
33        return numCourses == seen;
34    }
35}