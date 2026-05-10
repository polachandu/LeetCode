class MyLinkedList {
    class Node {
        int val;
        Node prev, next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;
    int size;

    public MyLinkedList() {
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            return -1;
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        if (head != null) {
            node.next = head;
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        if (head == null)
            head = node;
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            node.prev = current;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size)
            return;
        if (index <= 0) {
            addAtHead(val);
            return;
        }
        if (index >= size) {
            addAtTail(val);
            return;
        }
        Node node = new Node(val);
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node temp = current.next;
        current.next = node;
        node.next = temp;
        node.prev = current;
        if (temp != null)
            temp.prev = node;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size)
            return;
        if (index == 0) {
            head = head.next;
            if (head != null)
                head.prev = null;
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            if (current.next != null)
                current.next.prev = current.prev;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */