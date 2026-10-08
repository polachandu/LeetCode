// Last updated: 10/8/2026, 12:01:13 PM
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
12    public ListNode reverseList(ListNode head) {
13        if (head == null) {
14            return head;
15        }
16        ListNode prev = null;
17        ListNode current = head;
18        while (current != null) {
19            ListNode next = current.next;
20            current.next = prev;
21            prev = current;
22            current = next;
23        }
24        return prev;
25    }
26}