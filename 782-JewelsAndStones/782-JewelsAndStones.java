// Last updated: 8/12/2026, 11:13:21 AM
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