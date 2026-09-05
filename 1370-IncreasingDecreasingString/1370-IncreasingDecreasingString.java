// Last updated: 9/5/2026, 12:31:05 PM
class Solution {
    public String sortString(String s) {
        int[] count = new int[26];
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        while (length > 0) {
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    count[i]--;
                    sb.append((char) (i + 'a'));
                    length--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (count[i] > 0) {
                    count[i]--;
                    sb.append((char) (i + 'a'));
                    length--;
                }
            }
        }
        return sb.toString();
    }

    }
