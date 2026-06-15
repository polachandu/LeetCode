class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList();
        List<Integer> current = new ArrayList();
        backTrack(results, 0, current, nums);
        return results;
    }

    private void backTrack(List<List<Integer>> results, int start, List<Integer> current, int[] nums) {
        results.add(new ArrayList(current));
        if (current.size() == nums.length)
            return;
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            current.add(nums[i]);
            backTrack(results, i + 1, current, nums);
            current.remove(current.size() - 1);
        }
    }
}