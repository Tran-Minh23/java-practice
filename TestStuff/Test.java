import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(new Node<>(10));
        // queue.enqueue(new Node<>(20));
        // queue.enqueue(new Node<>(30));

        System.out.println(queue.tail);

    }
}
