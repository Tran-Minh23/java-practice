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
        int[] arr = { 2, 2, 3, 4, 5 };
        int result = beautifulTriplets(1, Arrays.asList(2, 2, 3, 4, 5));

        System.out.println(result);
    }

    public static int beautifulTriplets(int d, List<Integer> arr) {
        // int result = 0;
        // int baseIndex = 0;

        // for (int i = baseIndex; i <= arr.size() - 3; i++) {

        // List<Integer> check = new ArrayList<>();
        // check.add(arr.get(baseIndex));

        // for (int j = baseIndex + 1; j < arr.size() - 1; j++) {
        // int up1 = j;

        // for (int k = up1 + 2; k < arr.size(); k++) {
        // if (arr.get(baseIndex).equals(arr.get(up1))) {
        // continue;
        // }

        // if (arr.get(up1).equals(arr.get(k))) {
        // continue;
        // }

        // System.out.println("cc" + baseIndex + up1 + k);
        // if ((arr.get(up1) - arr.get(baseIndex)) == (arr.get(k) - arr.get(up1))
        // && (arr.get(up1) - arr.get(baseIndex)) == d) {
        // result++;
        // }
        // }
        // }

        // baseIndex++;
        // }

        // return result;

        int result = 0;

        Map<Integer, Integer> seen = new HashMap<>();
        for (int i : arr) {

            if (seen.containsKey(i - 2 * d) && seen.containsKey(i - d)) {
                int firstCount = seen.get(i - 2 * d);
                int secondCount = seen.get(i - d);
                result += firstCount * secondCount;
            }

            seen.merge(i, 1, (oldValue, value) -> ++oldValue);
        }

        return result;
    }
}
