// Last updated: 10/23/2026, 6:07:32 PM
1class KthLargest {
2    PriorityQueue<Integer> minHeap;
3    int capacity;
4
5    public KthLargest(int k, int[] nums) {
6        minHeap = new PriorityQueue<Integer>();
7        capacity = k;
8        for (int i = 0; i < nums.length; i++) {
9            minHeap.add(nums[i]);
10            if (minHeap.size() > k) {
11                minHeap.poll();
12            }
13        }
14    }
15
16    public int add(int val) {
17        minHeap.add(val);
18        while (minHeap.size() > capacity) {
19            minHeap.poll();
20        }
21        return minHeap.peek();
22    }
23}
24
25/**
26 * Your KthLargest object will be instantiated and called as such:
27 * KthLargest obj = new KthLargest(k, nums);
28 * int param_1 = obj.add(val);
29 */