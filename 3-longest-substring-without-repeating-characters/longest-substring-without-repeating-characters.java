class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0, result = 0;
        HashMap<Character, Integer> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i), i);
            result = Math.max(result, i-left+1);
        }
        return result;
    }
}