// Last updated: 10/8/2026, 7:34:54 PM
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        Map<Node, Node> map = new HashMap();
19        Node current = head;
20        while (current != null) {
21            map.put(current, new Node(current.val));
22            current = current.next;
23        }
24
25        current = head;
26        while (current != null) {
27            Node cloned = map.get(current);
28            cloned.next = map.get(current.next);
29            cloned.random = map.get(current.random);
30            current = current.next;
31        }
32        return map.get(head);
33    }
34}