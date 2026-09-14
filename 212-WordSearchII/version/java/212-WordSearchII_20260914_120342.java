// Last updated: 9/14/2026, 12:03:42 PM
1class MedianFinder {
2    PriorityQueue<Integer> minHeap;
3    PriorityQueue<Integer> maxHeap;
4
5    public MedianFinder() {
6        minHeap = new PriorityQueue();
7        maxHeap = new PriorityQueue(Collections.reverseOrder());
8    }
9
10    public void addNum(int num) {
11        maxHeap.offer(num);
12        minHeap.offer(maxHeap.poll());
13        if (minHeap.size() > maxHeap.size()) {
14            maxHeap.offer(minHeap.poll());
15        }
16    }
17
18    public double findMedian() {
19        if (minHeap.size() == maxHeap.size()) {
20            return (minHeap.peek() + maxHeap.peek()) / 2.0;
21        }
22        return maxHeap.peek();
23    }
24}
25
26/**
27 * Your MedianFinder object will be instantiated and called as such:
28 * MedianFinder obj = new MedianFinder();
29 * obj.addNum(num);
30 * double param_2 = obj.findMedian();
31 */