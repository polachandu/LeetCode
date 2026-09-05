// Last updated: 9/5/2026, 12:27:54 PM
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
    public ListNode frequenciesOfElements(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap();
        ListNode res = new ListNode(0);
        while(head != null){
            map.put(head.val,map.getOrDefault(head.val,0)+1);
            head = head.next;
        }
        ListNode curr = res;
        for(int i: map.values()){
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        return res.next;
    }
}