import java.util.Scanner;

public class array {
    /*
     * public static void main(String[] args) {
     * Scanner sc= new Scanner(System.in);
     * int size=sc.nextInt();
     * int[] marks=new int[size];
     * //input
     * for(int i=0;i<size;i++){
     * marks[i]=sc.nextInt();
     * }
     * int max= Integer.MAX_VALUE;
     * int min=Integer.MIN_VALUE;
     * 
     * //output
     * for(int i=0;i<marks.length;i++){
     * if(marks[i]<min){
     * min=marks[i];
     * }
     * if(marks[i]>max){
     * max=marks[i];
     * }
     * }
     * System.out.println("Minimum value from array : "+min);
     * System.out.println("Maximum value from array : "+max);
     * }
     */

    // Take an array of numbers as input and check if it is an array sorted in
    // ascending order.
    // Eg : { 1, 2, 4, 7 } is sorted in ascending order.
    // {3, 4, 6, 2} is not sorted in ascending order.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int array[] = new int[num];

        // input
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        // output
        boolean isAscending = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isAscending = false;
                break; // optional 
but efficient
            }
        }
        if (isAscending) {
            System.out.println("The arrays is sorted in assending order.");
        } else {
            System.out.println("The arrays is not sorted in assending order.");
        }
    }
}
