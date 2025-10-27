class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int longest = 0;
        Map<Character, Integer> storeMap = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (storeMap.containsKey(s.charAt(i))) {
                start = Math.max(start, storeMap.get(s.charAt(i)) + 1);
            }
            storeMap.put(s.charAt(i), i);
            longest = Math.max(longest, i - start + 1);
        }
        return longest;
    }
}