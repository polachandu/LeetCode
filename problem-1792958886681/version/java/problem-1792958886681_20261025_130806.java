// Last updated: 10/25/2026, 1:08:06 PM
1class Solution {
2    public List<String> topKFrequent(String[] words, int k) {
3        Map<String, Integer> map = new HashMap();
4        PriorityQueue<String> minHeap = new PriorityQueue<>(
5                (a, b) -> map.get(a).equals(map.get(b)) ? b.compareTo(a) : map.get(a) - map.get(b));
6        for (String word : words) {
7            map.put(word, map.getOrDefault(word, 0) + 1);
8        }
9        for (Map.Entry<String, Integer> entry : map.entrySet()) {
10            minHeap.add(entry.getKey());
11            if (minHeap.size() > k) {
12                minHeap.poll();
13            }
14        }
15        List<String> result = new ArrayList();
16        while (!minHeap.isEmpty()) {
17            result.add(minHeap.poll());
18        }
19        Collections.reverse(result);
20        return result;
21    }
22}