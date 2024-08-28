import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        List<Integer> test;
        test = IntStream.range(0, 100000000).mapToObj(i -> i).collect(Collectors.toList());
        int sum = 0;

        Instant start = Instant.now();

        // for (int i = 0; i < test.size(); i++) {
        // sum += test.get(i);
        // }

        sum = test.stream().reduce(0, (a, b) -> a + b);

        // sum = test.stream().collect(Collectors.summingInt(Integer::intValue));

        // sum =
        // test.parallelStream().collect(Collectors.summingInt(Integer::intValue));

        System.out.println(sum);

        Instant end = Instant.now();
        System.out.println(Duration.between(start, end));

    }

    public static String superReducedString(String s) {
        int i = 0;

        while (true && i < s.length() - 1) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                StringBuilder sb = new StringBuilder(s);
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                s = sb.toString();

                i = 0;
            } else {
                i++;
            }
        }

        if (s.length() == 0) {
            return "Empty String";
        }

        return s;
    }
}
