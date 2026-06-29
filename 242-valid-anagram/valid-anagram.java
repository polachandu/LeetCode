class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> sMap = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char tChar = t.charAt(i);
            if (!sMap.containsKey(tChar) || sMap.get(tChar) == 0) {
                return false;
            }
            sMap.put(tChar, sMap.getOrDefault(tChar, 0) - 1);
        }
        return true;
    }
}