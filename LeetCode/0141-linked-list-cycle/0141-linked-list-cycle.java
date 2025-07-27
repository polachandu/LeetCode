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
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        Set<ListNode> nodeSet = new HashSet();
        ListNode curr = head;
        while (curr != null) {
            if (nodeSet.contains(curr)) {

                return true;
            }
            nodeSet.add(curr);
            curr = curr.next;

        }
        return false;
    }
}