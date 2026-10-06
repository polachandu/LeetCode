// Last updated: 10/6/2026, 2:30:23 PM
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
16            length++;
17            current = current.next;
18        }
19        if (length == n) {
20            return head.next;
21        }
22        int nodeToBeRemoved = length - n;
23        int count = 1;
24        current = head;
25        while (count != nodeToBeRemoved && current.next != null) {
26            current = current.next;
27            count++;
28        }
29        if (current.next != null) {
30            current.next = current.next.next;
31        }
32        return head;
33    }
34}