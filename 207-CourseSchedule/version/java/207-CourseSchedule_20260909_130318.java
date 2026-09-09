// Last updated: 9/9/2026, 1:03:18 PM
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3
4        List<Integer> result = new ArrayList();
5        List<List<Integer>> graph = new ArrayList();
6        int[] indegree = new int[numCourses];
7
8        for (int i = 0; i < numCourses; i++) {
9            graph.add(new ArrayList());
10        }
11
12        for (int[] preq : prerequisites) {
13            graph.get(preq[1]).add(preq[0]);
14            indegree[preq[0]]++;
15        }
16
17        Queue<Integer> queue = new LinkedList();
18        for (int i = 0; i < numCourses; i++) {
19            if (indegree[i] == 0) {
20                queue.add(i);
21            }
22        }
23
24        while (!queue.isEmpty()) {
25            int curr = queue.poll();
26            result.add(curr);
27            for (int nei : graph.get(curr)) {
28                indegree[nei]--;
29                if (indegree[nei] == 0) {
30                    queue.add(nei);
31                }
32            }
33        }
34        if (result.size() != numCourses) {
35            return new int[0];
36        }
37        int[] resultArray = new int[numCourses];
38        for (int i = 0; i < result.size(); i++) {
39            resultArray[i] = result.get(i);
40        }
41        return resultArray;
42    }
43}