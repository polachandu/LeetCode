class Solution {
    public int countSubstrings(String s) {
        if (s.length() == 1)
            return 1;
        int count1 = 0, count2 = 0;
        for (int i = 0; i < s.length(); i++) {
            count1 += expand(s, i, i);
            count2 += expand(s, i, i + 1);
        }
        return count1 + count2;
    }

    private int expand(String s, int left, int right) {
        int intCount = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            intCount++;
            left--;
            right++;
        }
        return intCount;
    }
}