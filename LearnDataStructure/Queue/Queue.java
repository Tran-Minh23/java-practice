public class Queue<T> {
    public int length;
    public Node<T> head;
    public Node<T> tail;

    Queue() {
        this.head = this.tail = null;
        this.length = 0;
    }

    public void enqueue(Node<T> item) {
        this.length++;

        if (this.tail == null) {
            this.tail = this.head = item;
            return;
        }

        this.tail.next = item;
        this.tail = item;
    }

    public T dequeue() {
        if (this.head == null) {
            return null;
        }

        this.length--;
        Node<T> hhead = this.head;
        this.head = this.head.next;

        return hhead.value;
    }

    public T peek() {
        return this.head.value;
    }
}

class Node<T> {
    public T value;
    public Node<T> next;

    Node(T t) {
        this.value = t;
    }
}
