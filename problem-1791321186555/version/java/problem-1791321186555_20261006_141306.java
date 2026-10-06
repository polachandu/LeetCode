// Last updated: 10/6/2026, 2:13:06 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        while (headA != null) {
15            ListNode current = headB;
16            while (current != null) {
17                if (headA == current) {
18                    return headA;
19                }
20                current = current.next;
21            }
22            headA = headA.next;
23        }
24        return null;
25    }
26}