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
    public void reorderList(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode current = slow.next;
        slow.next = null;
        while (current != null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        ListNode first = head;
        ListNode second = prev;
        while (first != null && second != null) {
            ListNode firstTemp = first.next;
            ListNode secTemp = second.next;
            first.next = second;
            second.next = firstTemp;
            first = firstTemp;
            second = secTemp;
        }
    }
}