package LearnDataStructure.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DFSAdjacencyList {

    static boolean walk(WeightedAdjacencyList graph, int curr, int needle, boolean[] seen, List<Integer> path) {
        if (seen[curr]) {
            return false;
        }

        seen[curr] = true;
        path.add(curr);

        if (curr == needle) {
            return true;
        }

        List<GraphEdge> list = graph.graph.get(curr);
        for (int i = 0; i < list.size(); i++) {
            GraphEdge edge = list.get(i);

            if (walk(graph, edge.to, needle, seen, path)) {
                return true;
            }
        }

        path.remove(0);

        return false;
    }

    static List<Integer> dfs(WeightedAdjacencyList graph, int source, int needle) {
        boolean[] seen = new boolean[graph.graph.size()];
        Arrays.fill(seen, false);
        List<Integer> path = new LinkedList<>();

        walk(graph, source, needle, seen, path);

        return path;
    }
}

class WeightedAdjacencyList {
    public List<List<GraphEdge>> graph;

    WeightedAdjacencyList() {
        this.graph = new ArrayList<List<GraphEdge>>();
    }
}

class GraphEdge {
    public int to;
    public int weight;
}
