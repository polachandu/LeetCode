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
       ListNode curr = head;
       while(curr != null){
        count++;
        curr = curr.next;
       }
       if(count < n){
        return new ListNode();
       }
      
        int nodeToBeRemoved = count - n;
        if(nodeToBeRemoved == 0){
            return head.next;
        }
        curr = head;
        for(int i=1;i<nodeToBeRemoved;i++){
            curr = curr.next;
        }
        ListNode removingNode = curr.next;
        curr.next = removingNode.next;
        removingNode.next = null;

        return head;
    }
}