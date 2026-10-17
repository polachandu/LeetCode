// Last updated: 10/17/2026, 4:22:10 PM
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
12    public int getDecimalValue(ListNode head) {
13        ListNode current = head;
14        StringBuilder sb = new StringBuilder();
15        while (current != null) {
16            sb.append(current.val);
17            current = current.next;
18        }
19        String binaryString = sb.toString();
20        return Integer.parseInt(binaryString, 2);
21    }
22}