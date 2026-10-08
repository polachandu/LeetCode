// Last updated: 10/8/2026, 11:09:56 AM
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
16            ListNode head = lists[i];
17            ListNode current = head;
18            while (current != null) {
19                heap.add(current);
20                current = current.next;
21            }
22        }
23        ListNode current = dummy;
24        while (!heap.isEmpty()) {
25            current.next = heap.poll();
26            current = current.next;
27        }
28        current.next = null;
29        return dummy.next;
30    }
31}