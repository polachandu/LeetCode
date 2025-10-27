class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int longest = 0;
        Map<Character, Integer> charToNextIndex = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (charToNextIndex.containsKey(s.charAt(i))) {
                start = Math.max(start, charToNextIndex.get(s.charAt(i)) + 1);
            }
            charToNextIndex.put(c, i);
            longest = Math.max(longest, i - start + 1);

        }
        return longest;
    }

}