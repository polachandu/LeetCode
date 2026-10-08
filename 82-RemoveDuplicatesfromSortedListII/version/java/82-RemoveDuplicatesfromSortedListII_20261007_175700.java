// Last updated: 10/7/2026, 5:57:00 PM
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
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode dummy = new ListNode(-101, head);
14        ListNode prev = dummy;
15        ListNode current = head;
16        while (current != null) {
17            if (current.next != null && current.val == current.next.val) {
18                int dup = current.val;
19                while (current != null && current.val == dup) {
20                    current = current.next;
21                }
22                prev.next = current;
23            } else {
24                prev = current;
25                current = current.next;
26            }
27        }
28        return dummy.next;
29    }
30}