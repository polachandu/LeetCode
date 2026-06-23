class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> results = new ArrayList();
        List<Integer> current = new ArrayList();
        backTrack(results, current, candidates, target, 0);
        return results;
    }

    private void backTrack(List<List<Integer>> results, List<Integer> current, int[] candidates, int target,
            int start) {
        if (target == 0) {
            results.add(new ArrayList(current));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);
            backTrack(results, current, candidates, target - candidates[i], i);
            current.remove(current.size() - 1);
        }
    }
}