package LearnDataStructure.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BFSAdjacencyMatrix {
    static List<Integer> bfs(WeightedAdjacencyMatrix graph, int source, int needle) {
        boolean[] seen = new boolean[graph.graph.size()];
        int[] prev = new int[graph.graph.size()];

        Arrays.fill(seen, false);
        Arrays.fill(prev, -1);

        seen[source] = true;
        List<Integer> q = new LinkedList<>();

        q.add(source);

        do {
            int curr = q.remove(0);

            if (curr == needle) {
                break;
            }

            List<Integer> adjs = graph.graph.get(curr);
            for (int i = 0; i < adjs.size(); i++) {
                if (adjs.get(i) == 0) {
                    continue;
                }

                if (seen[i]) {
                    continue;
                }

                seen[i] = true;
                prev[i] = curr;
                q.add(i);
            }
        } while (!q.isEmpty());
    }
}

class WeightedAdjacencyMatrix {
    public List<List<Integer>> graph;

    WeightedAdjacencyMatrix() {
        this.graph = new ArrayList<List<Integer>>();
    }
}
