// Last updated: 10/27/2026, 9:37:04 PM
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> graph = new ArrayList();
4        List<Integer> result = new ArrayList();
5        int[] indegree = new int[numCourses];
6        for (int i = 0; i < numCourses; i++) {
7            graph.add(new ArrayList());
8        }
9        for (int[] preq : prerequisites) {
10            graph.get(preq[1]).add(preq[0]);
11            indegree[preq[0]]++;
12        }
13        Queue<Integer> queue = new LinkedList();
14        for (int i = 0; i < numCourses; i++) {
15            if (indegree[i] == 0) {
16                queue.add(i);
17            }
18        }
19        while (!queue.isEmpty()) {
20            int curr = queue.poll();
21            result.add(curr);
22            for (int nei : graph.get(curr)) {
23                indegree[nei]--;
24                if (indegree[nei] == 0) {
25                    queue.add(nei);
26                }
27            }
28        }
29        if (result.size() != numCourses) {
30            return new int[0];
31        }
32        int[] resultArray = new int[numCourses];
33        for (int i = 0; i < numCourses; i++) {
34            resultArray[i] = result.get(i);
35        }
36        return resultArray;
37    }
38}