// Last updated: 8/12/2026, 11:10:25 AM
class DLLNode{
    public String data;
    public DLLNode prev, next;

    DLLNode(String url){
        this.data = url;
        this.prev = null;
        this.next = null;
    }
}

class BrowserHistory {

    private DLLNode linkedListHead;
    private DLLNode current;

    public BrowserHistory(String homepage) {
        linkedListHead = new DLLNode(homepage);
        current = linkedListHead;
    }
    
    public void visit(String url) {
        DLLNode newNode = new DLLNode(url);
        current.next = newNode;
        newNode.prev = current;
        current = newNode;
    }
    
    public String back(int steps) {
        while(steps > 0 && current.prev != null){
            current = current.prev;
            steps--;
        }
        return current.data;
    }
    
    public String forward(int steps) {
        while(steps > 0 && current.next != null){
            current = current.next;
            steps--;
        }
        return current.data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */