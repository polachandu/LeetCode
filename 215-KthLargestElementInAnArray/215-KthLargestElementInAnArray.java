// Last updated: 8/12/2026, 11:16:12 AM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue();

        for (int i = 0; i < nums.length; i++) {

            minHeap.offer(nums[i]);

            if (minHeap.size() > k) {

                minHeap.poll();

            }

        }

        return minHeap.peek();
    }
}