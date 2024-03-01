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
        // List<List<Integer>> container = new ArrayList<>();
        // container.add(Arrays.asList(0, 2, 1));
        // container.add(Arrays.asList(1,1,1));
        // container.add(Arrays.asList(2,0,0));

        int[] stack = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean result = binarySearch(stack, 5);

        System.out.println(result);
    }

    public static boolean binarySearch(int[] stack, int needle) {
        int lo = 0;
        int hi = stack.length;

        do {
            int m = (int) Math.floor((lo + hi) / 2);
            int v = stack[m];

            if (v == needle) {
                return true;
            }
            else if (v > needle) {
                hi = m;
            }
            else {
                lo = m+1;
            }
        }
        while(lo < hi);

        return false;
    }
}

