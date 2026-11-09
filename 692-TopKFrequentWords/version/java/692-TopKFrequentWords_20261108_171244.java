// Last updated: 11/8/2026, 5:12:44 PM
1class Solution {
2    public List<String> topKFrequent(String[] words, int k) {
3        List<String> results = new ArrayList();
4        Map<String, Integer> map = new HashMap();
5        PriorityQueue<String> minHeap = new PriorityQueue<>(
6                (a, b) -> map.get(a).equals(map.get(b)) ? b.compareTo(a) : map.get(a) - map.get(b));
7
8        for (String word : words) {
9            map.put(word, map.getOrDefault(word, 0) + 1);
10        }
11
12        for (String key : map.keySet()) {
13            minHeap.add(key);
14            if (minHeap.size() > k) {
15                minHeap.poll();
16            }
17        }
18
19        while (!minHeap.isEmpty()) {
20            results.add(minHeap.poll());
21        }
22        Collections.reverse(results);
23        return results;
24    }
25}