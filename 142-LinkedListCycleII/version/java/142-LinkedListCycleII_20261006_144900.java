// Last updated: 10/6/2026, 2:49:00 PM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        Map<ListNode, Integer> map = new HashMap();
15        Set<ListNode> set = new HashSet();
16        ListNode current = head;
17        int count = 0;
18        while (current != null) {
19            if (set.contains(current)) {
20                return current;
21            }
22            set.add(current);
23            map.put(current, count++);
24            current = current.next;
25        }
26        return null;
27    }
28}