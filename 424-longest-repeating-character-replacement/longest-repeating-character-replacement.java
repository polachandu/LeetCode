class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, maxLen = 0, maxFreq = 0;
        int[] chars = new int[26];
        for (int right = 0; right < s.length(); right++) {
            chars[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, chars[s.charAt(right) - 'A']);

            int windowSize = right - left + 1;
            if (windowSize - maxFreq > k) {
                chars[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}