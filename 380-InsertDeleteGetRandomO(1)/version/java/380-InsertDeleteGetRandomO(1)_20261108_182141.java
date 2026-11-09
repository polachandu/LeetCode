// Last updated: 11/8/2026, 6:21:41 PM
1class RandomizedSet {
2    private List<Integer> list;
3    private Map<Integer, Integer> indexOf;
4    private final Random random;
5
6    public RandomizedSet() {
7        list = new ArrayList();
8        indexOf = new HashMap();
9        random = new Random();
10    }
11
12    public boolean insert(int val) {
13        if (indexOf.containsKey(val))
14            return false;
15        list.add(val);
16        indexOf.put(val, list.size() - 1);
17        return true;
18    }
19
20    public boolean remove(int val) {
21        Integer idx = indexOf.get(val);
22        if (idx == null)
23            return false;
24
25        int lastIdx = list.size() - 1;
26        int last = list.get(lastIdx);
27
28        list.set(idx, last);
29        indexOf.put(last, idx);
30        list.remove(lastIdx);
31        indexOf.remove(val);
32        return true;
33    }
34
35    public int getRandom() {
36        return list.get(random.nextInt(list.size()));
37    }
38}
39
40/**
41 * Your RandomizedSet object will be instantiated and called as such:
42 * RandomizedSet obj = new RandomizedSet();
43 * boolean param_1 = obj.insert(val);
44 * boolean param_2 = obj.remove(val);
45 * int param_3 = obj.getRandom();
46 */