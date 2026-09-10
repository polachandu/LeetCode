// Last updated: 9/10/2026, 10:54:35 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeKLists(ListNode[] lists) {
13        PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>((ListNode a, ListNode b) -> (a.val - b.val));
14        for (ListNode list : lists) {
15            if (list != null) {
16                minHeap.add(list);
17            }
18        }
19
20        ListNode dummy = new ListNode(0);
21        ListNode current = dummy;
22
23        while (!minHeap.isEmpty()) {
24            ListNode node = minHeap.poll();
25            current.next = node;
26            if (node.next != null) {
27                minHeap.add(node.next);
28            }
29            current = current.next;
30        }
31
32        return dummy.next;
33    }
34}