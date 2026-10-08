// Last updated: 10/7/2026, 6:02:21 PM
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
12    public ListNode sortList(ListNode head) {
13        ListNode current = head;
14        List<Integer> list = new ArrayList();
15        while (current != null) {
16            list.add(current.val);
17            current = current.next;
18        }
19        Collections.sort(list);
20        ListNode dummy = new ListNode(-1);
21        current = dummy;
22        for (int i = 0; i < list.size(); i++) {
23            current.next = new ListNode(list.get(i));
24            current = current.next;
25        }
26        return dummy.next;
27    }
28}