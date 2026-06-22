public class Backtracking {

    // ------------------ Change Array using Backtracking ------------------
    public static void changeArr(int arr[], int i, int val) {
        // Base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }

        // Recursive step
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);

        // Backtracking step
        arr[i] = arr[i] - 2;
    }

    // Print array
    public static void printArr(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // ------------------ Find All Subsets ------------------
    public static void findSubsets(String str, String ans, int i) {
        // Base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // YES choice → include character
        findSubsets(str, ans + str.charAt(i), i + 1);

        // NO choice → exclude character
        findSubsets(str, ans, i + 1);
    }

    // ------------------ Find All Permutations ------------------
    public static void findPermutations(String str, String ans) {
        // Base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Recursive step
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            // Remove current character
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // Recursive call
            findPermutations(newStr, ans + curr);
        }
    }

    // ------------------ Main Method ------------------
    public static void main(String[] args) {

        // Example 1: Change array
        int arr[] = new int[5];
        changeArr(arr, 0, 1);

        System.out.println("Final Array:");
        printArr(arr);

        // Example 2: Find subsets
        System.out.println("\nSubsets:");
        String str = "abc";
        findSubsets(str, "", 0);

        // Example 3: Find permutations
        System.out.println("\nPermutations:");
        findPermutations(str, "");
    }
}
