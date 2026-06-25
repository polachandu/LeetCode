class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int num : nums) {
            set.add(num);
        }
        int maxStreak = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                int currentNum = nums[i];
                int currentStreak = 0;
                while (set.contains(currentNum)) {
                    set.remove(currentNum);
                    currentNum++;
                    currentStreak++;
                }
                maxStreak = Math.max(maxStreak, currentStreak);
            }

        }
        return maxStreak;
    }
}