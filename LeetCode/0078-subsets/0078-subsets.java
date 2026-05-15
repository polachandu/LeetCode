class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList();
        List<Integer> current = new ArrayList();
        backTrack(nums, 0, results, current);
        return results;
    }

    private void backTrack(int[] nums, int start, List<List<Integer>> results, List<Integer> current) {
        results.add(new ArrayList(current));
        if (current.size() == nums.length) {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            backTrack(nums, i + 1, results, current);
            current.remove(current.size() - 1);
        }
    }

}