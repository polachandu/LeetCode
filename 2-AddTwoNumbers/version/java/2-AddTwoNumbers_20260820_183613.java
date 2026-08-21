// Last updated: 8/20/2026, 6:36:13 PM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        int carry = 0;
14        ListNode head = new ListNode(0);
15        ListNode current = head;
16
17        while (l1 != null || l2 != null || carry != 0) {
18            int l1val = (l1 != null) ? l1.val : 0;
19            int l2val = (l2 != null) ? l2.val : 0;
20            int sum = l1val + l2val + carry;
21
22            carry = sum / 10;
23            ListNode newListNode = new ListNode(sum % 10);
24            current.next = newListNode;
25            current = current.next;
26            if (l1 != null)
27                l1 = l1.next;
28            if (l2 != null)
29                l2 = l2.next;
30        }
31        return head.next;
32    }
33}