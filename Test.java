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

        int p = 400;
        int q = 700;

        kaprekarNumbers(p, q);

        // System.out.println(result);
    }

    public static void kaprekarNumbers(int p, int q) {
        boolean found = false;

        for (int i = p; i <= q; i++) {
            long square = (long) i * i;
            String str = String.valueOf(square);
            int length = str.length();

            String t1 = str.substring(0, length / 2);
            String t2 = str.substring(length / 2, length);

            int c1 = t1.isEmpty() ? 0 : Integer.valueOf(t1);
            int c2 = t2.isEmpty() ? 0 : Integer.valueOf(t2);

            if(i == 1) {
                System.out.print(i + " ");
                found = true;
            }
            else {
                if (c1+c2==i) {
                    System.out.print(i + " ");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("INVALID RANGE");
        }
    }
}

