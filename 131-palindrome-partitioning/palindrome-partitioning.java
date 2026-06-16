class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> results = new ArrayList();
        List<String> current = new ArrayList();
        backTrack(results, current, s, 0);
        return results;
    }

    private void backTrack(List<List<String>> results, List<String> current, String s, int start) {
        if (start == s.length()) {
            results.add(new ArrayList(current));
            return;
        }
        for (int end = start; end < s.length(); end++) {
            String sub = s.substring(start, end + 1);
            if (isPalindrome(sub)) {
                current.add(sub);
                backTrack(results, current, s, end + 1);
                current.remove(current.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(right) != s.charAt(left)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}