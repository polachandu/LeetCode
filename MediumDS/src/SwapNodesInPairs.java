//Given a linked list, swap every two adjacent nodes and return its head. 
//You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
//
//Example 1:
//Input: head = [1,2,3,4]
//Output: [2,1,4,3]
//
//Example 2:
//Input: head = []
//Output: []
//		
//Example 3:
//Input: head = [1]
//Output: [1]
		
public class SwapNodesInPairs {
	
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
	
	public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
    return head;

        ListNode first = head.next;
        ListNode second = first.next;


	ListNode temp = swapPairs(second);
	if(head != null && head.next != null){
	   int c = head.val;
	   head.val = head.next.val;
	   head.next.val = c;
	}

return head;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
