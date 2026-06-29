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
        int count = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            count++;
        }
        current = head;
        int len = 0;

        if (count == n)
            return head.next;

        while ((count - len - 1) != n) {
            current = current.next;
            len++;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
        // while (current != null) {
        //     current = current.next;
        // }
        return head;
    }
}