// Last updated: 8/12/2026, 11:16:47 AM
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            int temp = n & 1;
            if (temp == 1)
                count++;
            n = n >>> 1;
        }
        return count;
    }
}