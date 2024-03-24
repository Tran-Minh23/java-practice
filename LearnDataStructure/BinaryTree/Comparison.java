package LearnDataStructure.BinaryTree;

import java.util.LinkedList;
import java.util.List;

public class Comparison {
    public static boolean compare(BinaryNode a, BinaryNode b) {
        if (a == null && b == null) {
            return true;
        }

        if (a == null || b == null) {
            return false;
        }

        if (a.value != b.value) {
            return false;
        }

        return compare(a.left, b.left) && compare(a.right, b.right);
    }
}

class BinaryNode {
    public int value;
    public BinaryNode left;
    public BinaryNode right;
}