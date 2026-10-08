// Last updated: 10/8/2026, 10:36:28 AM
1class LRUCache {
2
3    class Node {
4        int key;
5        int value;
6        Node prev;
7        Node next;
8
9        public Node(int key, int value) {
10            this.key = key;
11            this.value = value;
12        }
13    }
14
15    Map<Integer, Node> map;
16    int capacity;
17    Node dummyHead;
18    Node dummyTail;
19
20    public LRUCache(int capacity) {
21        this.map = new HashMap();
22        this.capacity = capacity;
23        dummyHead = new Node(0, 0);
24        dummyTail = new Node(0, 0);
25        dummyHead.next = dummyTail;
26        dummyTail.prev = dummyHead;
27    }
28
29    public int get(int key) {
30        if (map.containsKey(key)) {
31            Node node = map.get(key);
32            removeNode(node);
33            addAtFront(node);
34            return node.value;
35        } else {
36            return -1;
37        }
38    }
39
40    public void put(int key, int value) {
41        if (map.containsKey(key)) {
42            Node node = map.get(key);
43            node.value = value;
44            removeNode(node);
45            addAtFront(node);
46        } else {
47            Node node = new Node(key, value);
48            if (map.size() >= capacity) {
49                Node lru = dummyTail.prev;
50                removeNode(lru);
51                map.remove(lru.key);
52            }
53            addAtFront(node);
54            map.put(key, node);
55        }
56    }
57
58    private void addAtFront(Node node) {
59        Node nodeToAdd = dummyHead.next;
60        dummyHead.next = node;
61        node.prev = dummyHead;
62        node.next = nodeToAdd;
63        nodeToAdd.prev = node;
64    }
65
66    private void removeNode(Node node) {
67        node.prev.next = node.next;
68        node.next.prev = node.prev;
69    }
70}
71
72/**
73 * Your LRUCache object will be instantiated and called as such:
74 * LRUCache obj = new LRUCache(capacity);
75 * int param_1 = obj.get(key);
76 * obj.put(key,value);
77 */