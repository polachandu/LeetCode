// Last updated: 8/20/2026, 4:17:15 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1)
            return 1;
        int left = 0, right = 0;
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap();
        while (right < s.length()) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            map.put(s.charAt(right), right);
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}