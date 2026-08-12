// Last updated: 8/12/2026, 11:10:11 AM
class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] isIncomingEdgeExists = new boolean[n];
        for (List<Integer> edge : edges) {
            isIncomingEdgeExists[edge.get(1)] = true;
        }

        List<Integer> requireNodes = new ArrayList();
        for (int i = 0; i < n; i++) {
            if (!isIncomingEdgeExists[i]) {
                requireNodes.add(i);
            }
        }
        return requireNodes;
    }
}