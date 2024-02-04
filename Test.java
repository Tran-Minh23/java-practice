import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(0, 0, 1, 0, 0, 0, 0));

        int result = jumpingOnClouds(myList);

        System.out.println(result);
    }

    public static int jumpingOnClouds(List<Integer> c) {
        int count = 0;
        int n = c.size();

        for (int i = 0; i < n - 1; i++) {
            if (c.get(i) == 0) {
                i++;
            }

            count++;
        }

        return count;
    }
}

