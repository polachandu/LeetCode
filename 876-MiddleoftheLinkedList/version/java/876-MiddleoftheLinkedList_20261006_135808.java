// Last updated: 10/6/2026, 1:58:08 PM
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
14        int middle = 0;
15
16        ListNode current = head;
17        while (current != null) {
18            length++;
19            current = current.next;
20        }
21        if (middle % 2 == 0) {
22            middle = length / 2;
23        } else {
24            middle = length / 2 + 1;
25        }
26        int count = 0;
27        current = head;
28        while (count != middle) {
29            current = current.next;
30            count++;
31        }
32        return current;
33    }
34}