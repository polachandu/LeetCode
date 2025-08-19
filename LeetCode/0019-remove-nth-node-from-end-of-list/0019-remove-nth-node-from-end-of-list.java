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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        ListNode curr = head;
        dummy.next = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        ListNode prev = dummy;
        count -= n;
        int drop=0;
        for (int i = 0; i < count; i++) {
            prev = prev.next;
        }
        if (prev.next != null) {
            prev.next = prev.next.next;
        }
        return dummy.next;
    }
}