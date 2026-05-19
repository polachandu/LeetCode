class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> results = new ArrayList();
        List<Integer> current = new ArrayList();
        backTrack(current, candidates, target, results, 0);
        return results;
    }

    private void backTrack(List<Integer> current, int[] candidates, int target, List<List<Integer>> results,
            int start) {
        if (target == 0) {
            results.add(new ArrayList(current));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1])
                continue;
            current.add(candidates[i]);
            backTrack(current, candidates, target - candidates[i], results, i + 1);
            current.remove(current.size() - 1);
        }
    }
}