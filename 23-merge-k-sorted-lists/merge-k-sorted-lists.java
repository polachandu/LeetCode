/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> sortedList = new ArrayList();
        for (ListNode listNode : lists) {
            ListNode node = listNode;
            ListNode current = node;
            while (current != null) {
                sortedList.add(current.val);
                current = current.next;
            }
        }
        Collections.sort(sortedList);
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int i = 0; i < sortedList.size(); i++) {
            current.next = new ListNode(sortedList.get(i));
            current = current.next;
        }
        return dummy.next;
    }
}