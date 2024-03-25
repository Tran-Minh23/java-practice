package LearnDataStructure.BinaryTree;

import java.util.LinkedList;
import java.util.List;

public class BreathFirstSearch {

    public static boolean bfs(BinaryNode head, int needle) {
        List<BinaryNode> q = new LinkedList<>();
        q.add(head);

        while (!q.isEmpty()) {
            BinaryNode curr = q.remove(0);

            if (curr.value == needle) {
                return true;
            }

            if (curr.left != null) {
                q.add(curr.left);
            }

            if (curr.right != null) {
                q.add(curr.right);
            }
        }

        return false;
    }
}

class BinaryNode {
    public int value;
    public BinaryNode left;
    public BinaryNode right;
}
