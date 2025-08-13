/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
};
*/

class Solution {
    public int[] toArray(Node head) {
        int count = 0;

        Node curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        int[] res = new int[count];
        int temp = 0;
        while(head != null){
            res[temp++] = head.val;
            head = head.next;
        }
    return res;
    }
}