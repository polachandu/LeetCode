// Last updated: 10/6/2026, 2:18:16 PM
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
12    public boolean isPalindrome(ListNode head) {
13        StringBuilder sb = new StringBuilder();
14        while (head != null) {
15            sb.append(head.val);
16            head = head.next;
17        }
18        String nodeString = sb.toString();
19        String reverseString = sb.reverse().toString();
20        if (nodeString.equals(reverseString)) {
21            return true;
22        } else {
23            return false;
24        }
25    }
26}