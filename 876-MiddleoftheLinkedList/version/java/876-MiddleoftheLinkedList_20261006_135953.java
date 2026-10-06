// Last updated: 10/6/2026, 1:59:53 PM
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
12    public ListNode middleNode(ListNode head) {
13        int length = 0;
14
15        ListNode current = head;
16        while (current != null) {
17            length++;
18            current = current.next;
19        }
20
21        int count = 0;
22        current = head;
23        while (count != length / 2) {
24            current = current.next;
25            count++;
26        }
27        return current;
28    }
29}