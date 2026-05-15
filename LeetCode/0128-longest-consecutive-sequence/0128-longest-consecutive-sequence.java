class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        Set<Integer> set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                int currentStreak = 1;
                int current = nums[i];
                while (set.contains(current + 1)) {
                    set.remove(current);
                    currentStreak++;
                    current++;
                }
                count = Math.max(count, currentStreak);
            }
        }
        return count;
    }
}