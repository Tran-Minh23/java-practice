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
        List<Integer> myList = new ArrayList<>(Arrays.asList(3, 3 ,2, 1 ,3));

        int result = jumpingOnClouds(myList);

        System.out.println(result);
    }

    public static int jumpingOnClouds(List<Integer> arr) {
        int result = 0;
        int largest = 0;
        int numL = -1;
        Map<Integer, Integer> countOccur = new HashMap<>();

        for (int num : arr) {
            if (countOccur.containsKey(num)) {
                countOccur.put(num, countOccur.get(num) + 1);
            }
            else {
                countOccur.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : countOccur.entrySet()) {
            if (entry.getValue() > largest) {
                largest = entry.getValue();
                numL = entry.getKey();
            }
        }

        for (Map.Entry<Integer, Integer> entry : countOccur.entrySet()) {
            if (entry.getKey() != numL) {
                result += entry.getValue();
            }            
        }
        return result;
    }
}

