//Given the head of a sorted linked list, delete all duplicates such that each element appears only once. 
//Return the linked list sorted as well.
//
//Example 1:
//Input: head = [1,1,2]
//Output: [1,2]
//		
//Example 2:
//Input: head = [1,1,2,3,3]
//Output: [1,2,3]
		
public class RemoveDuplicatesFromSortedList {
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { 
		    	  this.val = val; 
		    	  }
		      ListNode(int val, ListNode next) { 
		    	  this.val = val; 
		    	  this.next = next; 
		    	  }
		 }
	 public ListNode deleteDuplicates(ListNode head) {
	        ListNode currentNode = head;
	        while(currentNode != null){
	            ListNode temp = currentNode.next;
	            while(temp != null && currentNode.val == temp.val){
	                temp = temp.next;
	            }
	                currentNode.next = temp;
	                currentNode = temp;   
	        }
	         return head;
	    }
	 public ListNode deleteDuplicates1(ListNode head) {
		    ListNode current = head;
		    while (current != null && current.next != null) {
		        if (current.next.val == current.val) {
		            current.next = current.next.next;
		        } else {
		            current = current.next;
		        }
		    }
		    return head;
		}
}
