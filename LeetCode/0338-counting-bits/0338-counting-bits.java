class Solution {
    public int[] countBits(int n) {
        int[] array = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            array[i] = hammingWeight(i);
        }
        return array;
    }

    private int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}