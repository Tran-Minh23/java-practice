public class Stack<T> {
    public int length;
    public Node<T> head;
    // public Node<T> tail;

    Stack() {
        this.head = null;
        this.length = 0;
    }

    public void push(Node<T> item) {
        this.length++;

        if (this.head == null) {
            this.head = item;
            return;
        }

        item.prev = this.head;
        this.head = item;
    }

    public T pop() {
        if (this.head == null) {
            return null;
        }

        this.length--;
        Node<T> hhead = this.head;
        this.head = this.head.prev;

        return hhead.value;
    }

    public T peek() {
        return this.head.value;
    }
}
