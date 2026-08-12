// Last updated: 8/12/2026, 11:17:17 AM
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
    public ListNode sortList(ListNode head) {
        ListNode curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        curr = head;
        int[] arr = new int[count];
        for(int i=0;i<count;i++){
            arr[i] = curr.val;
            curr = curr.next;
        }

        Arrays.sort(arr);
        ListNode newNode = new ListNode(0);
        ListNode newCurr = newNode;
        for(int i=0;i<count;i++){
            ListNode temp = new ListNode(arr[i]);
            newCurr.next = temp;
            newCurr = newCurr.next;
        }
        return newNode.next;
    }
}