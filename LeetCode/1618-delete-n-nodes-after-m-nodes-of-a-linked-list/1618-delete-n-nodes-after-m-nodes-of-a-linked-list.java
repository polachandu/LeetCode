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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode currentNode = head;
        ListNode lastNode = head;
        while (currentNode != null) {
            int mCount = 0;
            int nCount = 0;
            while (currentNode != null && mCount != m) {
                lastNode = currentNode;
                currentNode = currentNode.next;
                mCount++;
            }
            while (currentNode != null && nCount != n) {
                currentNode = currentNode.next;
                nCount++;
            }
            lastNode.next = currentNode;
        }
        return head;
    }
}