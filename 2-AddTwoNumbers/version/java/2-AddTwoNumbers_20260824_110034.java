// Last updated: 8/24/2026, 11:00:34 AM
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        int length = 0;
14        ListNode current = head;
15        while (current != null) {
16            current = current.next;
17            length++;
18        }
19        if (length == n) {
20            return head.next;
21        }
22        current = head;
23        int nodeToBeRemoved = length - n - 1;
24        while (nodeToBeRemoved != 0) {
25            if (current.next != null) {
26                current = current.next;
27                nodeToBeRemoved--;
28            }
29        }
30        if (current.next != null) {
31            current.next = current.next.next;
32        }
33
34        return head;
35    }
36}