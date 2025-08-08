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
    public String gameResult(ListNode head) {
        ListNode even = head;
        int countEven = 0;
        int countOdd = 0;
        while(even != null){
            ListNode odd = even.next;
            if(even.val > odd.val){
                countEven++;
            }else if(even.val < odd.val){
                countOdd++;
            }
            else{
                continue;
            }
            even = odd.next;
        }
        if(countEven > countOdd){
            return "Even";
        }else if(countOdd > countEven){
            return "Odd";
        }else{
            return "Tie";
        }
    }
}