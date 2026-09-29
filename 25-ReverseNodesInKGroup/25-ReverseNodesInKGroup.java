// Last updated: 9/28/2026, 8:52:51 PM
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
    public ListNode reverseKGroup(ListNode head, int k) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            length++;
        }
        if (length < k) {
            return head;
        }
        int maxReversals = length / k;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode groupPrevTail = dummy;
        current = head;
        while (maxReversals != 0) {
            ListNode prev = null;
            ListNode groupStart = current;
            int count = k;
            while (count != 0) {
                ListNode nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
                count--;
            }
            groupPrevTail.next = prev;
            groupStart.next = current;
            groupPrevTail = groupStart;
            maxReversals--;
        }
        return dummy.next;
    }
}