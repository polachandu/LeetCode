// Last updated: 8/12/2026, 11:08:17 AM
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
    public ListNode mergeNodes(ListNode head) {
        
        ListNode newNode = new ListNode(0);
        ListNode newtemp = newNode;
        ListNode temp = head.next;
        int sum = 0;
        if(head == null && head.next == null) return head;
        while(temp != null){
            sum += temp.val;
            if(temp.val == 0){
                ListNode node = new ListNode(sum);
                newtemp.next = node;
                newtemp = newtemp.next;
                sum = 0;
            }

           temp = temp.next;
        }
        return newNode.next;
    }
}