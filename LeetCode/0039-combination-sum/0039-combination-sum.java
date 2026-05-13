class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> results = new ArrayList();
        List<Integer> current = new ArrayList();
        backTrack(0, current, target, results, candidates);
        return results;
    }

    private void backTrack(int start, List<Integer> current, int calculation, List<List<Integer>> results,
            int[] candidates) {
        if (calculation == 0) {
            results.add(new ArrayList(current));
            return;
        }
        if (calculation < 0)
            return;
        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);
            backTrack(i, current, calculation - candidates[i], results, candidates);
            current.remove(current.size() - 1);
        }
    }
}