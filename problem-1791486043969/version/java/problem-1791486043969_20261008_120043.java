// Last updated: 10/8/2026, 12:00:43 PM
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
13        ListNode prev = null;
14        ListNode current = head;
15        while (current != null) {
16            ListNode next = current.next;
17            current.next = prev;
18            prev = current;
19            current = next;
20        }
21        return prev;
22    }
23}