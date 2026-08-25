// Last updated: 8/24/2026, 9:39:54 PM
1class Solution {
2    public List<String> letterCombinations(String digits) {
3        Map<Character, String> map = new HashMap();
4        map.put('2', "abc");
5        map.put('3', "def");
6        map.put('4', "ghi");
7        map.put('5', "jkl");
8        map.put('6', "mno");
9        map.put('7', "pqrs");
10        map.put('8', "tuv");
11        map.put('9', "wxyz");
12
13        List<String> results = new ArrayList();
14
15        backTrack(digits, 0, new StringBuilder(), map, results);
16
17        return results;
18    }
19
20    private void backTrack(String digits, int index, StringBuilder current, Map<Character, String> map,
21            List<String> results) {
22        if (current.length() == digits.length()) {
23            results.add(current.toString());
24            return;
25        }
26
27        char digit = digits.charAt(index);
28        String letters = map.get(digit);
29
30        for (char letter : letters.toCharArray()) {
31            current.append(letter);
32            backTrack(digits, index + 1, current, map, results);
33            current.deleteCharAt(current.length() - 1);
34        }
35    }
36}