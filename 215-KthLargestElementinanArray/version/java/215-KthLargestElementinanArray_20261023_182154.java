// Last updated: 10/23/2026, 6:21:54 PM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
4        for (int num : nums) {
5            minHeap.add(num);
6            if (minHeap.size() > k) {
7                minHeap.poll();
8            }
9        }
10        return minHeap.peek();
11    }
12}