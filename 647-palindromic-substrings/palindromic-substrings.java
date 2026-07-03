class Solution {
    public int countSubstrings(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int count1 = 0, count2 = 0;
        for (int i = 0; i < s.length(); i++) {
            count1 += expand(s, i, i);
            count2 += expand(s, i, i + 1);
        }
        return count1 + count2;
    }

    private int expand(String s, int start, int end) {
        int intCount = 0;
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
            intCount++;
        }
        return intCount;
    }
}