class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());
        for (int stone : stones) {
            maxHeap.offer(stone);
        }
        while (!maxHeap.isEmpty()) {
            if (maxHeap.size() == 1)
                return maxHeap.peek();
            int a = maxHeap.poll();
            int b = maxHeap.poll();
            maxHeap.offer(a - b);
        }
        return 0;
    }
}