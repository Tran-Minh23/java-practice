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
        int[] data = { 1 };
        int result = flatlandSpaceStations(6, data);

        System.out.println(result);
    }

    static int flatlandSpaceStations(int n, int[] arr) {
        Arrays.sort(arr);
        int maxDistance = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int distance = (arr[i] - arr[i - 1]) / 2;

            if (maxDistance < distance) {
                maxDistance = distance;
            }
        }

        int lastGap = (n - 1) - arr[arr.length - 1];

        if (maxDistance < lastGap) {
            maxDistance = lastGap;
        }

        return maxDistance;
    }
}
