// Last updated: 9/28/2026, 9:16:08 PM
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        String[] words = s.split(" ");
4        if (pattern.length() != words.length) {
5            return false;
6        }
7        Map<Character, String> charToWord = new HashMap();
8        Map<String, Character> wordToChar = new HashMap();
9        for (int i = 0; i < pattern.length(); i++) {
10            if (charToWord.containsKey(pattern.charAt(i))) {
11                if (!charToWord.get(pattern.charAt(i)).equals(words[i])) {
12                    return false;
13                }
14            }
15
16            if (wordToChar.containsKey(words[i])) {
17                if (!wordToChar.get(words[i]).equals(pattern.charAt(i))) {
18                    return false;
19                }
20            }
21            charToWord.put(pattern.charAt(i), words[i]);
22            wordToChar.put(words[i], pattern.charAt(i));
23        }
24        return true;
25    }
26}