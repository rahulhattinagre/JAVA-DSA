public class Practice {

    // Advanced Bubble Sort
    public static void bubbleSort(int arr[]) {
        int comparisons = 0;
        int swaps = 0;

        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean swapped = false; // optimization

            for (int j = 0; j < arr.length - 1 - turn; j++) {
                comparisons++;

                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    swapped = true;
                }
            }

            // If no swapping, array is already sorted
            if (!swapped) {
                System.out.println("Array already sorted. Stopping early.");
                break;
            }
        }

        System.out.println("Total Comparisons = " + comparisons);
        System.out.println("Total Swaps = " + swaps);
    }

    // Print array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {6, 5, 6, 7, 8, 2};

        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
