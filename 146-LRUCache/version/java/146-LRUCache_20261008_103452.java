// Last updated: 10/8/2026, 10:34:52 AM
1class LRUCache {
2
3    class Node {
4        int key;
5        int value;
6        Node prev;
7        Node next;
8
9        Node(int key, int value) {
10            this.key = key;
11            this.value = value;
12        }
13    }
14
15    int capacity;
16    Map<Integer, Node> hashmap;
17    Node dummyHead;
18    Node dummyTail;
19
20    public LRUCache(int capacity) {
21        this.hashmap = new HashMap();
22        this.capacity = capacity;
23        dummyHead = new Node(0, 0);
24        dummyTail = new Node(0, 0);
25        dummyHead.next = dummyTail;
26        dummyTail.prev = dummyHead;
27    }
28
29    public int get(int key) {
30        if (hashmap.containsKey(key)) {
31            Node node = hashmap.get(key);
32            removeNode(node);
33            addAtFront(node);
34            return node.value;
35        } else {
36            return -1;
37        }
38    }
39
40    public void put(int key, int value) {
41        if (hashmap.containsKey(key)) {
42            Node node = hashmap.get(key);
43            node.value = value;
44            removeNode(node);
45            addAtFront(node);
46        } else {
47            Node node = new Node(key, value);
48            addAtFront(node);
49            hashmap.put(key, node);
50            if (hashmap.size() > capacity) {
51                Node lru = dummyTail.prev;
52                removeNode(lru);
53                hashmap.remove(lru.key);
54            }
55        }
56    }
57
58    public void addAtFront(Node node) {
59        Node headNext = dummyHead.next;
60        dummyHead.next = node;
61        node.prev = dummyHead;
62        node.next = headNext;
63        headNext.prev = node;
64
65    }
66
67    public void removeNode(Node node) {
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