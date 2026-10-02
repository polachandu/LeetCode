// Last updated: 10/1/2026, 7:27:29 PM
1class Solution {
2    public int totalFruit(int[] fruits) {
3        int maxCount = 0;
4        int left = 0, freqCount = 0;
5        Map<Integer, Integer> map = new HashMap();
6        for (int right = 0; right < fruits.length; right++) {
7            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
8
9            while (map.size() > 2) {
10                map.put(fruits[left], map.get(fruits[left]) - 1);
11                if (map.get(fruits[left]) == 0) {
12                    map.remove(fruits[left]);
13                }
14                left++;
15            }
16
17            maxCount = Math.max(maxCount, right - left + 1);
18        }
19        return maxCount;
20    }
21}