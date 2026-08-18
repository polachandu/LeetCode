// Last updated: 8/18/2026, 11:12:34 AM
1class TimeMap {
2
3    Map<String, List<String[]>> store;
4
5    public TimeMap() {
6        store = new HashMap();
7    }
8
9    public void set(String key, String value, int timestamp) {
10        store.putIfAbsent(key, new ArrayList());
11        store.get(key).add(new String[] { String.valueOf(timestamp), value });
12    }
13
14    public String get(String key, int timestamp) {
15        if (!store.containsKey(key))
16            return "";
17        List<String[]> list = store.get(key);
18        int left = 0, right = list.size() - 1;
19        String result = "";
20        while (left <= right) {
21            int mid = left + (right - left) / 2;
22            int midTime = Integer.parseInt(list.get(mid)[0]);
23            if (midTime <= timestamp) {
24                result = list.get(mid)[1];
25                left = mid + 1;
26            } else {
27                right = mid - 1;
28            }
29        }
30        return result;
31    }
32}
33
34/**
35 * Your TimeMap object will be instantiated and called as such:
36 * TimeMap obj = new TimeMap();
37 * obj.set(key,value,timestamp);
38 * String param_2 = obj.get(key,timestamp);
39 */