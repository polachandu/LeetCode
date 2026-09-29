// Last updated: 9/28/2026, 8:52:57 PM
class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> results = new ArrayList();

        backTrack(digits, 0, new StringBuilder(), map, results);

        return results;
    }

    private void backTrack(String digits, int index, StringBuilder current, Map<Character, String> map,
            List<String> results) {
        if (current.length() == digits.length()) {
            results.add(current.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = map.get(digit);

        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backTrack(digits, index + 1, current, map, results);
            current.deleteCharAt(current.length() - 1);
        }
    }
}