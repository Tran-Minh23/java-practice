package LearnAlgo.Search;

public class Search {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };

        int result = binarySearch(0, arr.length - 1, arr, 2);

        System.out.println(result);
    }

    public static int binarySearch(int low, int high, int[] arr, int find) {
        int result = -1;

        while (low <= high) {
            int mid = (high + low) / 2;

            if (arr[mid] == find) {
                return arr[mid];
            }

            if (arr[mid] < find) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}
