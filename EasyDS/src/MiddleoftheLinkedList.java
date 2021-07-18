//Given a non-empty, singly linked list with head node head, return a middle node of linked list.
//
//If there are two middle nodes, return the second middle node.
//
//Example 1:
//Input: [1,2,3,4,5]
//Output: Node 3 from this list (Serialization: [3,4,5])
//The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
//Note that we returned a ListNode object ans, such that:
//ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.

//Example 2:
//Input: [1,2,3,4,5,6]
//Output: Node 4 from this list (Serialization: [4,5,6])
//Since the list has two middle nodes with values 3 and 4, we return the second one.

public class MiddleoftheLinkedList {
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
	 int length =0;
	    public ListNode middleNode(ListNode head) {
	        ListNode temp = new ListNode();
	        temp = head;
	        while(temp != null){
	            temp = temp.next;
	            this.length++;
	        }
	        int n = this.length/2;
	        int counter =0;
	        
	        while(counter != n){
	            head = head.next;
	            counter ++;
	        }
	        
	        
	    return head;
	}
	    public ListNode middleNode1(ListNode head) {
	        ListNode a = head;
	        ListNode b = head;
	        
	        while(b != null && b.next != null) {
	            a = a.next;
	            b = b.next.next;
	        }
	        return a;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DO NOT RUN THE PROGRAM COZ I DIDN'T ADD THE DATA INTO LISTS
	}

}
