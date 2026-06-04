class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        if (s == null || s.length() < 2) {
            return s.length();
        }
        for (int i = 0; i < s.length(); i++) {
            count += expand(s, i, i);
            count += expand(s, i, i + 1);
        }
        return count;
    }

    private int expand(String s, int left, int right) {
        int length = 0;
        while (left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)) {
            length++;
            left--;
            right++;
        }
        return length;
    }
}