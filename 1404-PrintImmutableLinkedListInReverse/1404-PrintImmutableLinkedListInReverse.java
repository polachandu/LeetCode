// Last updated: 8/12/2026, 11:11:17 AM
/**
 * // This is the ImmutableListNode's API interface.
 * // You should not implement it, or speculate about its implementation.
 * interface ImmutableListNode {
 *     public void printValue(); // print the value of this node.
 *     public ImmutableListNode getNext(); // return the next node.
 * };
 */

class Solution {
    public void printLinkedListInReverse(ImmutableListNode head) {
        ImmutableListNode curr = head; 
        Stack<ImmutableListNode> stack = new Stack<>();
        while(curr != null){
            stack.push(curr);
            curr = curr.getNext();
        }
        while(!stack.empty()){
            ImmutableListNode node = stack.pop();
            node.printValue();
        }
    }
}