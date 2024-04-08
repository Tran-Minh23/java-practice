import java.util.Arrays;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        // String result = biggerIsGreater("fedcbabcd");

        // System.out.println(result);

        int[] cc = { 1, 2, 3, 4, 5 };
        String ok = nextPermutation1("dkhc");
        System.out.println(ok);
    }

    public static String biggerIsGreater(String w) {
        String result = "no answer";
        char[] charStr = w.toCharArray();

        int last = (int) charStr[charStr.length - 1];
        int nextLow = -1;
        int position = -1;

        for (int i = 0; i < charStr.length - 1; i++) {
            int current = (int) charStr[i];

            if (current < last && current >= nextLow) {
                nextLow = current;
                position = i;
            }
        }

        if (nextLow > -1 && position > -1) {
            // char temp = charStr[charStr.length - 1];
            // charStr[charStr.length - 1] = charStr[position];
            // charStr[position] = temp;

            shift(charStr, position);

            return String.copyValueOf(charStr);
        }

        return result;
    }

    public static void shift(char[] arr, int position) {
        // Save the last element
        char lastElement = arr[arr.length - 1];

        // Shift elements to the right from index n
        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the saved last element at index n
        arr[position] = lastElement;
    }

    public static boolean nextPermutation(int[] array) {
        // Find longest non-increasing suffix
        int i = array.length - 1;

        while (i > 0 && array[i - 1] >= array[i]) {
            i--;
            // Now i is the head index of the suffix
        }

        // Are we at the last permutation already?
        if (i <= 0) {
            return false;
        }

        // Let array[i - 1] be the pivot
        // Find rightmost element greater than the pivot
        int j = array.length - 1;
        while (array[j] <= array[i - 1]) {
            j--;
        }

        // Now the value array[j] will become the new pivot
        // Assertion: j >= i
        // Swap the pivot with j
        int temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;

        // Reverse the suffix
        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        // Successfully computed the next permutation
        return true;
    }
}
