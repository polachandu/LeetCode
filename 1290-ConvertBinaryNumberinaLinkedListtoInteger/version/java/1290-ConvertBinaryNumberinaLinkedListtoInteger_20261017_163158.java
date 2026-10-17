// Last updated: 10/17/2026, 4:31:58 PM
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
13        int result = 0;
14        while (head != null) {
15            result = result * 2 + head.val;
16            head = head.next;
17        }
18        return result;
19    }
20}