class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList();
        List<Integer> current = new ArrayList();
        backTrack(results, current, nums);
        return results;
    }

    private void backTrack(List<List<Integer>> results, List<Integer> current, int[] nums) {

        if (current.size() == nums.length) {
            results.add(new ArrayList(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (current.contains(nums[i])) {
                continue;
            }
            current.add(nums[i]);
            backTrack(results, current, nums);
            current.remove(current.size() - 1);
        }

    }
}