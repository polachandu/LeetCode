// Last updated: 10/26/2026, 6:52:38 PM
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
15    Node head;
16    Node tail;
17    Map<Integer, Node> map;
18    int capacity;
19
20    public LRUCache(int capacity) {
21        this.capacity = capacity;
22        map = new HashMap();
23        head = new Node(0, 0);
24        tail = new Node(0, 0);
25        head.next = tail;
26        tail.prev = head;
27    }
28
29    public int get(int key) {
30        if (map.containsKey(key)) {
31            Node node = map.get(key);
32            deleteNode(node);
33            addAtFront(node);
34            return node.val;
35        }
36        return -1;
37    }
38
39    public void put(int key, int value) {
40        if (map.containsKey(key)) {
41            Node node = map.get(key);
42            deleteNode(node);
43            addAtFront(node);
44            node.val = value;
45        } else {
46            Node node = new Node(key, value);
47            map.put(key, node);
48            if (map.size() > capacity) {
49                Node lru = tail.prev;
50                deleteNode(lru);
51                map.remove(lru.key);
52            }
53            addAtFront(node);
54        }
55    }
56
57    private void addAtFront(Node node) {
58        Node nodeToBeConnected = head.next;
59        head.next = node;
60        node.prev = head;
61        node.next = nodeToBeConnected;
62        nodeToBeConnected.prev = node;
63    }
64
65    private void deleteNode(Node node) {
66        node.prev.next = node.next;
67        node.next.prev = node.prev;
68    }
69}
70
71/**
72 * Your LRUCache object will be instantiated and called as such:
73 * LRUCache obj = new LRUCache(capacity);
74 * int param_1 = obj.get(key);
75 * obj.put(key,value);
76 */