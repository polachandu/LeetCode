// Last updated: 8/25/2026, 12:42:38 PM
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
12    public void reorderList(ListNode head) {
13        ListNode current = head;
14        int length = 0;
15        while (current != null) {
16            length++;
17            current = current.next;
18        }
19
20        int cutPlace = length % 2 == 0 ? length / 2 : (length / 2) + 1;
21        current = head;
22        ListNode firstHalfLast = current;
23        while (cutPlace != 0) {
24            firstHalfLast = current;
25            current = current.next;
26            cutPlace--;
27        }
28        firstHalfLast.next = null;
29        ListNode prev = null;
30
31        while (current != null) {
32            ListNode next = current.next;
33            current.next = prev;
34            prev = current;
35            current = next;
36        }
37        ListNode secondHalf = prev;
38        ListNode firstHalf = head;
39
40        while (firstHalf != null && secondHalf != null) {
41            ListNode firstNext = firstHalf.next;
42            ListNode secondNext = secondHalf.next;
43
44            firstHalf.next = secondHalf;
45            secondHalf.next = firstNext;
46            
47            firstHalf = firstNext;
48            secondHalf = secondNext;
49        }
50    }
51}