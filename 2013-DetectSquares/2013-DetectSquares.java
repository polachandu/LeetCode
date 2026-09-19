// Last updated: 9/19/2026, 2:04:46 PM
class DetectSquares {
    Map<Integer, Map<Integer, Integer>> space;

    public DetectSquares() {
        space = new HashMap();
    }

    public void add(int[] point) {
        int x = point[0], y = point[1];
        space.putIfAbsent(x, new HashMap());
        Map<Integer, Integer> innerMap = space.get(x);
        innerMap.put(y, innerMap.getOrDefault(y, 0) + 1);
        space.putIfAbsent(x, innerMap);
    }

    public int count(int[] point) {
        int x = point[0], y = point[1];
        int totalCount = 0;

        if (!space.containsKey(x)) {
            return 0;
        }
        Map<Integer, Integer> sameXPoints = space.get(x);

        for (Map.Entry<Integer, Integer> entry : sameXPoints.entrySet()) {
            int y2 = entry.getKey();
            int freqY2 = entry.getValue();

            if (y2 == y)
                continue;
            int d = Math.abs(y2 - y);
            if (space.containsKey(x - d)) {
                Map<Integer, Integer> leftPoints = space.get(x - d);
                if (leftPoints.containsKey(y) && leftPoints.containsKey(y2)) {
                    totalCount += freqY2 * leftPoints.get(y) * leftPoints.get(y2);
                }
            }
            if (space.containsKey(x + d)) {
                Map<Integer, Integer> rightPoints = space.get(x + d);
                if (rightPoints.containsKey(y) && rightPoints.containsKey(y2)) {
                    totalCount += freqY2 * rightPoints.get(y) * rightPoints.get(y2);
                }
            }

        }
        return totalCount;
    }
}

/**
 * Your DetectSquares object will be instantiated and called as such:
 * DetectSquares obj = new DetectSquares();
 * obj.add(point);
 * int param_2 = obj.count(point);
 */