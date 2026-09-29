// Last updated: 9/28/2026, 10:55:37 PM
1class MyHashMap {
2    List<List<Integer>> list = new ArrayList();
3
4    public MyHashMap() {
5        list = new ArrayList();
6    }
7
8    public void put(int key, int value) {
9
10        for (List innerList : list) {
11            if ((Integer) innerList.get(0) == key) {
12                innerList.remove(1);
13                innerList.add(value);
14                return;
15            }
16        }
17        List<Integer> innerList = new ArrayList();
18        innerList.add(key);
19        innerList.add(value);
20        list.add(innerList);
21
22    }
23
24    public int get(int key) {
25        for (List<Integer> innerList : list) {
26            if (innerList.get(0) == key) {
27                return innerList.get(1);
28            }
29        }
30        return -1;
31    }
32
33    public void remove(int key) {
34        for (int i = 0; i < list.size(); i++) {
35            if (list.get(i).get(0) == key) {
36                list.remove(i);
37                return;
38            }
39        }
40    }
41}
42
43/**
44 * Your MyHashMap object will be instantiated and called as such:
45 * MyHashMap obj = new MyHashMap();
46 * obj.put(key,value);
47 * int param_2 = obj.get(key);
48 * obj.remove(key);
49 */