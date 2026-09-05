// Last updated: 9/5/2026, 12:30:01 PM
class OrderedStream {
    private int n;
    private String[] arr;

    public OrderedStream(int n) {
        this.n = 0;
        this.arr = new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        ArrayList<String> list = new ArrayList<>();
            
            arr[idKey-1] = value;
            while(n<arr.length && arr[n] != null){
            list.add(arr[n]);
            n++;
        }
        return list;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */