// Last updated: 10/23/2026, 6:14:55 PM
1class Solution {
2    public int lastStoneWeight(int[] stones) {
3        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
4        for (int stone : stones) {
5            maxHeap.offer(stone);
6        }
7        while (maxHeap.size() > 1) {
8            int a = maxHeap.poll();
9            int b = maxHeap.poll();
10            if (a != b) {
11                maxHeap.offer(Math.abs(a - b));
12            } else {
13                continue;
14            }
15        }
16        return maxHeap.size() == 0 ? 0 : maxHeap.peek();
17    }
18}