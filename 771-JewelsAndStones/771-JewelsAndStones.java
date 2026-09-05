// Last updated: 9/5/2026, 12:33:09 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        for (char s: stones.toCharArray()) // For each stone...
            for (char j: jewels.toCharArray()) // For each jewel...
                if (j == s) {  // If the stone is a jewel...
                    ans++;
                    break; // Stop searching whether this stone 's' is a jewel
                }
        return ans;
    }
}