// Last updated: 8/18/2026, 12:29:41 PM
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
19
20        Node current = head;
21        while (current != null) {
22            map.put(current, new Node(current.val));
23            current = current.next;
24        }
25
26        current = head;
27        while (current != null) {
28            Node clone = map.get(current);
29            clone.next = map.get(current.next);
30            clone.random = map.get(current.random);
31            current = current.next;
32        }
33        return map.get(head);
34    }
35}