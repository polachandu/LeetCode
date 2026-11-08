// Last updated: 11/8/2026, 4:04:31 PM
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        List<Integer> resultList = new ArrayList();
4        List<List<Integer>> graph = new ArrayList();
5        int[] indegree = new int[numCourses];
6
7        for (int i = 0; i < numCourses; i++) {
8            graph.add(new ArrayList());
9        }
10        Queue<Integer> queue = new LinkedList();
11
12        for (int[] preq : prerequisites) {
13            graph.get(preq[1]).add(preq[0]);
14            indegree[preq[0]]++;
15        }
16
17        for (int i = 0; i < numCourses; i++) {
18            if (indegree[i] == 0) {
19                queue.add(i);
20            }
21        }
22        while (!queue.isEmpty()) {
23            int curr = queue.poll();
24            resultList.add(curr);
25            for (Integer nei : graph.get(curr)) {
26                indegree[nei]--;
27                if (indegree[nei] == 0) {
28                    queue.add(nei);
29                }
30            }
31        }
32        if (resultList.size() != numCourses)
33            return new int[0];
34        int[] result = new int[resultList.size()];
35        for (int i = 0; i < result.length; i++) {
36            result[i] = resultList.get(i);
37        }
38        return result;
39    }
40}