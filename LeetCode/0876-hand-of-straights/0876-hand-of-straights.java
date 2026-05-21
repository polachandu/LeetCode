class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0)
            return false;
        Map<Integer, Integer> map = new TreeMap();
        for (int i = 0; i < hand.length; i++) {
            map.put(hand[i], map.getOrDefault(hand[i], 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > 0) {
                int count = map.get(key);
                for (int i = 0; i < groupSize; i++) {
                    if (map.getOrDefault(key + i, 0) < count)
                        return false;
                    map.put(key + i, map.get(key + i) - 1);
                }
            }
        }
        return true;
    }
}