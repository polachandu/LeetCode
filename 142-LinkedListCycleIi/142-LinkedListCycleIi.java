// Last updated: 8/12/2026, 11:17:28 AM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> nodeSeen = new HashSet<>();
        while(head != null){
            if(nodeSeen.contains(head)){
                return head;
            }else{
            nodeSeen.add(head);
            head = head.next;
            }
        }
        return null;
    }
}