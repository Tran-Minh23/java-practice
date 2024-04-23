import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        int result = minimumDistances(Arrays.asList(3, 2, 1, 2, 3));

        System.out.println(result);
    }

    public static int minimumDistances(List<Integer> a) {
        int result = -1;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.size(); i++) {
            if (map.containsKey(a.get(i))) {
                int get = map.get(a.get(i));

                if (result == -1) {
                    result = i - get;
                } else {
                    int cc = i - get;

                    if (result > cc) {
                        result = cc;
                    }
                }
            } else {
                map.put(a.get(i), i);
            }
        }

        return result;
    }
}
