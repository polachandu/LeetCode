// Last updated: 10/27/2026, 7:45:34 PM
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
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15
16        ListNode preLeft = dummy;
17        for (int i = 1; i < left; i++) {
18            preLeft = preLeft.next;
19        }
20
21        ListNode leftNode = preLeft.next;
22        ListNode curr = leftNode;
23        ListNode prev = null;
24        for (int i = 0; i < right - left + 1; i++) {
25            ListNode nextNode = curr.next;
26            curr.next = prev;
27            prev = curr;
28            curr = nextNode;
29        }
30
31        preLeft.next = prev;
32        leftNode.next = curr;
33        return dummy.next;
34    }
35}