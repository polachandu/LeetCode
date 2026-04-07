class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                int currentStreak = 1;
                int currentNum = nums[i];
                while (set.contains(currentNum + 1)) {
                    set.remove(currentNum);
                    currentStreak++;
                    currentNum++;
                }
                count = Math.max(count, currentStreak);

            }
        }
        return count;
    }
}