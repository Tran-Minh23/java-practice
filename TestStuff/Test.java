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
        int result = workbook(5, 3, List.of(4, 2, 6));

        System.out.println(result);
    }

    public static int workbook(int n, int k, List<Integer> arr) {
        int result = 0;
        int page = 0;

        for (int num : arr) {
            for (int i = 1; i <= num; i++) {
                if (i == page) {
                    result++;
                }

                if ((i % k == 0) || i == num) {
                    page++;
                }
            }
        }

        System.out.println(page + "p");

        return result;
    }

}
