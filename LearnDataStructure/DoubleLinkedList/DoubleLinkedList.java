package LearnDataStructure.DoubleLinkedList;

public class DoubleLinkedList {

}

class DoubleLinkedListImplement<T> {
    public int length;
    private Node<T> head;
    private Node<T> tail;

    DoubleLinkedListImplement() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    public void prepend(Node<T> node) {
        this.length++;
        if (this.head == null) {
            this.head = this.tail = node;
            return;
        }

        node.next = this.head;
        this.head.prev = node;
        this.head = node;
    }

    public void insertAt(int idx, Node<T> item) {
        if (idx > this.length) {
            throw new Error("oh no");
        }

        if (idx == this.length) {
            this.append(item);
            return;
        } else if (idx == 0) {
            this.prepend(item);
            return;
        }

        this.length++;
        Node<T> curr = this.head;
        for (int i = 0; curr != null && i < idx; i++) {
            curr = curr.next;
        }

        item.next = curr;
        item.prev = curr.prev;
        curr.prev = item;

        if (item.prev != null) {
            curr.prev.next = item;
        }
    }

    public void append(Node<T> item) {
        this.length++;
        if (this.tail == null) {
            this.head = this.tail = item;
            return;
        }

        item.prev = this.tail;
        this.tail.next = item;
        this.tail = item;
    }

    public Node<T> remove(Node<T> item) {
        Node<T> curr = this.head;

        for (int i = 0; curr != null && i < this.length; i++) {
            if (curr.value == item.value) {
                break;
            }

            curr = curr.next;
        }

        if (curr == null) {
            return null;
        }

        this.length--;
        if (this.length == 0) {
            Node<T> out = this.head;
            this.head = this.tail = null;

            return out;
        }

        if (item.prev != null) {
            item.prev.next = item.next;
        }
        if (item.next != null) {
            item.next.prev = item.prev;
        }

        if (item == this.head) {
            this.head = curr.next;
        }
        if (item == this.tail) {
            this.tail = curr.prev;
        }

        curr.next = curr.prev = null;
    }

    public Node<T> get(int idx) {
        return this.getAt(idx);
    }

    private Node<T> getAt(int idx) {
        Node<T> curr = this.head;

        for (int i = 0; curr != null && i < idx; i++) {
            curr = curr.next;
        }

        return curr;
    }
}

class Node<T> {
    public T value;
    public Node<T> next;
    public Node<T> prev;

    Node(T t) {
        this.value = t;
    }
}