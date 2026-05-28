import java.util.Arrays;

public class MergeSortAdvanced {

    // Print Array
    public static <T> void printArr(T arr[]) {
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Generic Merge Sort
    public static <T extends Comparable<T>> void mergeSort(T arr[], int si, int ei, boolean ascending) {

        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        // Left Part
        mergeSort(arr, si, mid, ascending);

        // Right Part
        mergeSort(arr, mid + 1, ei, ascending);

        // Merge
        merge(arr, si, mid, ei, ascending);
    }

    // Generic Merge Function
    public static <T extends Comparable<T>> void merge(T arr[],
                                                        int si,
                                                        int mid,
                                                        int ei,
                                                        boolean ascending) {

        Object temp[] = new Object[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {

            int compare = arr[i].compareTo(arr[j]);

            if (ascending ? compare <= 0 : compare >= 0) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Left Part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Right Part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = (T) temp[k];
        }
    }

    // Case-Insensitive String Sort
    public static void sortStringsIgnoreCase(String arr[]) {
        Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
    }

    public static void main(String[] args) {

        // Integer Array
        Integer nums[] = { 8, 3, 1, 6, 2, 9, 5 };

        long start = System.nanoTime();

        mergeSort(nums, 0, nums.length - 1, true);

        long end = System.nanoTime();

        System.out.println("Ascending Integer Sort:");
        printArr(nums);

        System.out.println("Execution Time: " + (end - start) + " ns");

        // Descending Sort
        mergeSort(nums, 0, nums.length - 1, false);

        System.out.println("\nDescending Integer Sort:");
        printArr(nums);

        // String Array
        String planets[] = { "sun", "Earth", "mars", "Mercury" };

        mergeSort(planets, 0, planets.length - 1, true);

        System.out.println("\nString Sort:");
        printArr(planets);

        // Case Insensitive Sort
        sortStringsIgnoreCase(planets);

        System.out.println("\nCase-Insensitive Sort:");
        printArr(planets);
    }
}
