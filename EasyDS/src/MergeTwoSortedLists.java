//Merge two sorted linked lists and return it as a sorted list. 
//The list should be made by splicing together the nodes of the first two lists.
//
//Example 1:
//Input: l1 = [1,2,4], l2 = [1,3,4]
//Output: [1,1,2,3,4,4]

//Example 2:
//Input: l1 = [], l2 = []
//Output: []

//Example 3:
//Input: l1 = [], l2 = [0]
//Output: [0]

public class MergeTwoSortedLists {
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
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode currentNode = new ListNode(0);
        ListNode result = currentNode;
        while(l1 !=null && l2 != null){
            if(l1.val <= l2.val){
                currentNode.next = l1;
                currentNode = currentNode.next;
                l1 = l1.next;
            }else{
                currentNode.next = l2;
                currentNode = currentNode.next;
                l2 = l2.next;
            }
        }
            if( l1 == null){
                currentNode.next = l2;
            }else{
                currentNode.next = l1;
            }
        
        return result.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DO NOT RUN THE PROGRAM COZ I DIDN'T ADD THE DATA INTO LISTS
	}

}
