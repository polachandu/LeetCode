// Last updated: 11/8/2026, 4:35:26 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        Map<Integer, Integer> map = new HashMap();
4        PriorityQueue<Integer> minHeap = new PriorityQueue((a, b) -> map.get(a) - map.get(b));
5
6        for (int i = 0; i < nums.length; i++) {
7            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
8        }
9
10        for (int key : map.keySet()) {
11            minHeap.offer(key);
12            if (minHeap.size() > k) {
13                minHeap.poll();
14            }
15        }
16
17        int[] result = new int[minHeap.size()];
18        int i = 0;
19        while (!minHeap.isEmpty()) {
20            result[i++] = minHeap.poll();
21        }
22        return result;
23    }
24}