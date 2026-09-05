// Last updated: 9/5/2026, 12:33:29 PM
class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap();
        for (char ch : tasks) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int maxValue = Integer.MIN_VALUE;
        for (int val : map.values()) {
            maxValue = Math.max(maxValue, val);
        }
        int maxCount = 0;
        for (int val : map.values()) {
            if (val == maxValue) {
                maxCount++;
            }
        }

        return Math.max(((maxValue - 1) * (n + 1)) + maxCount, tasks.length);
    }
}