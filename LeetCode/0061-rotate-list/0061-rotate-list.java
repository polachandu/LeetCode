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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode oldTail = head;
        int total = 1;
        while(oldTail.next != null){
            oldTail = oldTail.next;
            total++;
        }
        oldTail.next = head;

        ListNode newTail= head;
        for(int i=0;i<(total-(k%total)-1);i++){
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }

}