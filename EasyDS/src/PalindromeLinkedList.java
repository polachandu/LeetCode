import java.util.ArrayList;

//Given the head of a singly linked list, return true if it is a palindrome.
//
//Example 1:
//Input: head = [1,2,2,1]
//Output: true
//
//Example 2:
//Input: head = [1,2]
//Output: false

public class PalindromeLinkedList {
	
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
	public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> l = new ArrayList<>();
        while(temp!=null){
            l.add(temp.val);
            temp = temp.next;
        }
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=l.size()-1;i>=0;i--){
            a.add(l.get(i));
        }
        return l.equals(a);
    }
}
