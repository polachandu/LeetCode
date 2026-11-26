// Last updated: 11/25/2026, 5:03:10 PM
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> graph = new ArrayList();
4        int[] indegree = new int[numCourses];
5        for (int i = 0; i < numCourses; i++) {
6            graph.add(new ArrayList());
7        }
8        for (int[] preq : prerequisites) {
9            graph.get(preq[1]).add(preq[0]);
10            indegree[preq[0]]++;
11        }
12
13        Queue<Integer> queue = new LinkedList();
14        List<Integer> result = new ArrayList();
15
16        for (int i = 0; i < numCourses; i++) {
17            if (indegree[i] == 0) {
18                queue.add(i);
19            }
20        }
21
22        while (!queue.isEmpty()) {
23            int curr = queue.poll();
24            result.add(curr);
25            for (int nei : graph.get(curr)) {
26                indegree[nei]--;
27                if (indegree[nei] == 0) {
28                    queue.add(nei);
29                }
30            }
31        }
32        if (result.size() != numCourses) {
33            return new int[0];
34        }
35        int[] resultArray = new int[numCourses];
36        for (int i = 0; i < result.size(); i++) {
37            resultArray[i] = result.get(i);
38        }
39        return resultArray;
40    }
41}