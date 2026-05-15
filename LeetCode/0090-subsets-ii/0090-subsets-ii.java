class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList();
        backTrack(0, results, nums, new ArrayList());
        return results;
    }

    private void backTrack(int start, List<List<Integer>> results, int[] nums, List<Integer> current) {

        results.add(new ArrayList(current));

        if (current.size() > nums.length) {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (i>start && nums[i] == nums[i - 1])
                continue;
            current.add(nums[i]);
            backTrack(i + 1, results, nums, current);
            current.remove(current.size() - 1);
        }
    }
}