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
    public ListNode partition(ListNode head, int x) {
        ListNode prevHead = new ListNode(0);
        ListNode prev = prevHead;
        ListNode postHead = new ListNode(0);
        ListNode post = postHead;

        while(head!= null){
            if(head.val < x){
                prev.next = new ListNode(head.val);
                prev = prev.next;
            }else{
                post.next = new ListNode(head.val);
                post = post.next;
            }
              head = head.next;      
        }
        post.next = null;
        prev.next = postHead.next;

        return prevHead.next;
    }

}