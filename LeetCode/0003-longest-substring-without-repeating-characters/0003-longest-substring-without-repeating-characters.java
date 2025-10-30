class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0, maxLen=0;
        Map<Character, Integer> storeMap = new HashMap();
        for(int right=0;right<s.length();right++){
            if(storeMap.containsKey(s.charAt(right))){
                left = Math.max(left, storeMap.get(s.charAt(right))+1);
            }
            storeMap.put(s.charAt(right),right);
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}