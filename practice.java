<<<<<<< HEAD
    public class practice {
        public static boolean isSorted(int nums[]){
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]>nums[i+1]){
                    return false;
                }
            }
            return true;
        }
        public static void main(String []args){
            int nums[]={9,8,7,6,4,5,6,7,8};
            practice p=new practice();
            boolean ans=p.isSorted(nums);
            System.out.println(ans);
        }
    }
            
=======
public class Practice {

    // Advanced Bubble Sort
    public static void bubbleSort(int arr[]) {
        int comparisons = 0;
        int swaps = 0;

        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean swapped = false; // optimization

            for (int j = 0; j < arr.length - 1 - turn; j++) {
                comparisons++;

               int a =a+b;
               int b= a-b;
               int a=a-b;
            }

            // If no swapping, array is already sorted
            if (!swapped) {
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
        int arr[] = {4, 4, 2, 7, 9, 3, 6};

        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
>>>>>>> 08862969cdb5bf16c71e1530c0f928b143259c39
