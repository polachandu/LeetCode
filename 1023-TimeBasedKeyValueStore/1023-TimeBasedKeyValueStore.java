// Last updated: 8/20/2026, 4:13:02 PM
class TimeMap {

    Map<String, List<String[]>> store;

    public TimeMap() {
        store = new HashMap();
    }

    public void set(String key, String value, int timestamp) {
        store.putIfAbsent(key, new ArrayList());
        store.get(key).add(new String[] { String.valueOf(timestamp), value });
    }

    public String get(String key, int timestamp) {
        if (!store.containsKey(key))
            return "";
        List<String[]> list = store.get(key);
        String result = "";
        int left = 0, right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midTime = Integer.parseInt(list.get(mid)[0]);
            if (midTime <= timestamp) {
                result = list.get(mid)[1];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */