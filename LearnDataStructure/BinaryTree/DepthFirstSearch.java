package LearnDataStructure.BinaryTree;

import java.util.LinkedList;
import java.util.List;

public class DepthFirstSearch {

    public static boolean search(BinaryNode curr, int needle) {
        if (curr == null) {
            return false;
        }

        if (curr.value == needle) {
            return true;
        }

        if (curr.value < needle) {
            return search(curr.right, needle);
        }

        return search(curr.left, needle);
    }
}

class BinaryNode {
    public int value;
    public BinaryNode left;
    public BinaryNode right;
}
