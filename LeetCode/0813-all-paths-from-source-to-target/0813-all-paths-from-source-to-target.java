class Solution {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<List<Integer>> q = new LinkedList<>();
        q.offer(Arrays.asList(0));
        int target = graph.length - 1;

        while (!q.isEmpty()) {
            List<Integer> path = q.poll();
            int last = path.get(path.size() - 1);
            if (last == target) {
                res.add(path);
                continue;
            }
            for (int nei : graph[last]) {
                List<Integer> nextPath = new ArrayList<>(path);
                nextPath.add(nei);
                q.offer(nextPath);
            }
        }
        return res;
    }
}