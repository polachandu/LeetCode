// Last updated: 10/19/2026, 8:12:08 PM
1class LRUCache {
2
3    class Node {
4        int key;
5        int val;
6        Node prev;
7        Node next;
8
9        public Node(int key, int val) {
10            this.key = key;
11            this.val = val;
12        }
13    }
14
15    int capacity;
16    Node head;
17    Node tail;
18    Map<Integer, Node> map;
19
20    public LRUCache(int capacity) {
21        this.capacity = capacity;
22        head = new Node(0, 0);
23        tail = new Node(0, 0);
24        head.next = tail;
25        tail.prev = head;
26        map = new HashMap();
27    }
28
29    public int get(int key) {
30        if (map.containsKey(key)) {
31            Node node = map.get(key);
32            removeNode(node);
33            addAtFront(node);
34            return node.val;
35        } else {
36            return -1;
37        }
38    }
39
40    public void put(int key, int value) {
41        if (map.containsKey(key)) {
42            Node node = map.get(key);
43            removeNode(node);
44            addAtFront(node);
45            node.val = value;
46
47        } else {
48            Node node = new Node(key, value);
49            if (map.size() >= capacity) {
50                Node nodeToBeRemoved = tail.prev;
51                removeNode(nodeToBeRemoved);
52                map.remove(nodeToBeRemoved.key);
53            }
54            addAtFront(node);
55            map.put(key, node);
56        }
57    }
58
59    private void addAtFront(Node node) {
60        Node nodeToBeConnected = head.next;
61        head.next = node;
62        node.prev = head;
63        node.next = nodeToBeConnected;
64        nodeToBeConnected.prev = node;
65    }
66
67    private void removeNode(Node node) {
68        node.prev.next = node.next;
69        node.next.prev = node.prev;
70    }
71}
72
73/**
74 * Your LRUCache object will be instantiated and called as such:
75 * LRUCache obj = new LRUCache(capacity);
76 * int param_1 = obj.get(key);
77 * obj.put(key,value);
78 */