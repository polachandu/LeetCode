class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0, maxLen = 0;
        Map<Integer, Integer> differentFruits = new HashMap();

        for (int right = 0; right < fruits.length; right++) {
            differentFruits.put(fruits[right], differentFruits.getOrDefault(fruits[right], 0) + 1);

            while (differentFruits.size() > 2) {
                differentFruits.put(fruits[left], differentFruits.get(fruits[left]) - 1);
                if (differentFruits.get(fruits[left]) == 0) {
                    differentFruits.remove(fruits[left]);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}