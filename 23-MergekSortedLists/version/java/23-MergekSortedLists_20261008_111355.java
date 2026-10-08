// Last updated: 10/8/2026, 11:13:55 AM
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
13        ListNode dummy = new ListNode(0);
14        PriorityQueue<ListNode> heap = new PriorityQueue<>((ListNode a, ListNode b) -> (a.val - b.val));
15        for (int i = 0; i < lists.length; i++) {
16            if (lists[i] != null) {
17                heap.add(lists[i]);
18            }
19        }
20        ListNode current = dummy;
21        while (!heap.isEmpty()) {
22            ListNode newNode = heap.poll();
23            current.next = newNode;
24            if (newNode.next != null) {
25                heap.add(newNode.next);
26            }
27            current = current.next;
28        }
29        return dummy.next;
30    }
31}