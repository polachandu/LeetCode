// Last updated: 9/10/2026, 5:58:08 PM
1class DetectSquares {
2    Map<Integer, Map<Integer, Integer>> space;
3
4    public DetectSquares() {
5        space = new HashMap();
6    }
7
8    public void add(int[] point) {
9        int x = point[0], y = point[1];
10        space.putIfAbsent(x, new HashMap());
11        Map<Integer, Integer> innerMap = space.get(x);
12        innerMap.put(y, innerMap.getOrDefault(y, 0) + 1);
13        space.putIfAbsent(x, innerMap);
14    }
15
16    public int count(int[] point) {
17        int x = point[0], y = point[1];
18        int totalCount = 0;
19
20        if (!space.containsKey(x)) {
21            return 0;
22        }
23        Map<Integer, Integer> sameXPoints = space.get(x);
24
25        for (Map.Entry<Integer, Integer> entry : sameXPoints.entrySet()) {
26            int y2 = entry.getKey();
27            int freqY2 = entry.getValue();
28
29            if (y2 == y)
30                continue;
31            int d = Math.abs(y2 - y);
32            if (space.containsKey(x - d)) {
33                Map<Integer, Integer> leftPoints = space.get(x - d);
34                if (leftPoints.containsKey(y) && leftPoints.containsKey(y2)) {
35                    totalCount += freqY2 * leftPoints.get(y) * leftPoints.get(y2);
36                }
37            }
38            if (space.containsKey(x + d)) {
39                Map<Integer, Integer> rightPoints = space.get(x + d);
40                if (rightPoints.containsKey(y) && rightPoints.containsKey(y2)) {
41                    totalCount += freqY2 * rightPoints.get(y) * rightPoints.get(y2);
42                }
43            }
44
45        }
46        return totalCount;
47    }
48}
49
50/**
51 * Your DetectSquares object will be instantiated and called as such:
52 * DetectSquares obj = new DetectSquares();
53 * obj.add(point);
54 * int param_2 = obj.count(point);
55 */