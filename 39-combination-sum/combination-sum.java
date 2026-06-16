class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> results = new ArrayList();
        List<Integer> current = new ArrayList();
        backTrack(results, current, candidates, target, 0);
        return results;
    }

    private void backTrack(List<List<Integer>> results, List<Integer> current, int[] nums, int target, int start) {
        if (target == 0) {
            results.add(new ArrayList(current));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            backTrack(results, current, nums, target - nums[i], i);
            current.remove(current.size() - 1);
        }
    }
}