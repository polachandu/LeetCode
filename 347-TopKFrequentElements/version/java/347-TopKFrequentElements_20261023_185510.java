// Last updated: 10/23/2026, 6:55:10 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        Map<Integer, Integer> map = new HashMap();
4        PriorityQueue<Integer> minHeap = new PriorityQueue((a, b) -> map.get(a) - map.get(b));
5
6        for (int num : nums) {
7            map.put(num, map.getOrDefault(num, 0) + 1);
8        }
9        for (int key : map.keySet()) {
10            minHeap.offer(key);
11            if (minHeap.size() > k) {
12                minHeap.poll();
13            }
14        }
15        int[] result = new int[k];
16        for (int i = 0; i < k; i++) {
17            result[i] = minHeap.poll();
18        }
19        return result;
20    }
21}