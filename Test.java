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
        List<List<Integer>> container = new ArrayList<>();
        container.add(Arrays.asList(0, 2, 1));
        container.add(Arrays.asList(1,1,1));
        container.add(Arrays.asList(2,0,0));

        String result = organizingContainers(container);

        System.out.println(result);
    }

    public static String organizingContainers(List<List<Integer>> container) {
        int[] elementInEach = new int[container.size()];
        int[] countOfEach = new int[container.size()];
        
        for (int i = 0; i < container.size(); i++) {
            for (int j = 0; j < container.size(); j++) {
                elementInEach[i] += container.get(i).get(j);
                countOfEach[i] += container.get(j).get(i);
            }
        }

        System.out.println(Arrays.toString(elementInEach));
        System.out.println(Arrays.toString(countOfEach));
        Arrays.sort(elementInEach);
        Arrays.sort(countOfEach);
        return Arrays.equals(elementInEach, countOfEach) ? "Possible": "Impossible";
    }
}

