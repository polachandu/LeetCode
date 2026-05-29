class Solution {
    public int[] countBits(int n) {
        int[] array = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            array[i] = Integer.bitCount(i);
        }
        return array;
    }
}