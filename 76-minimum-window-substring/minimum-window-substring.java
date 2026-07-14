class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length())
            return "";

        Map<Character, Integer> need = new HashMap();
        for (char ch : t.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap();
        int left = 0, right = 0;
        int required = need.size(), formed = 0;
        int minLen = Integer.MAX_VALUE, minLeft = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (need.containsKey(c) && window.get(c).equals(need.get(c))) {
                formed++;
            }

            while (formed == required && left <= right) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                }

                char leftChar = s.charAt(left);
                window.put(leftChar, window.getOrDefault(leftChar, 0) - 1);
                if (need.containsKey(leftChar) && window.get(leftChar) < need.get(leftChar)) {
                    formed--;
                }
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }
}