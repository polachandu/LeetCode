// Last updated: 8/22/2026, 1:48:41 PM
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
12    public ListNode reverseKGroup(ListNode head, int k) {
13        int length = 0;
14        ListNode current = head;
15        while (current != null) {
16            current = current.next;
17            length++;
18        }
19        if (length < k) {
20            return head;
21        }
22        int maxReversals = length / k;
23        ListNode dummy = new ListNode(0);
24        dummy.next = head;
25        ListNode groupPrevTail = dummy;
26        current = head;
27        while (maxReversals != 0) {
28            ListNode prev = null;
29            ListNode groupStart = current;
30            int count = k;
31            while (count != 0) {
32                ListNode nextNode = current.next;
33                current.next = prev;
34                prev = current;
35                current = nextNode;
36                count--;
37            }
38            groupPrevTail.next = prev;
39            groupStart.next = current;
40            groupPrevTail = groupStart;
41            maxReversals--;
42        }
43        return dummy.next;
44    }
45}