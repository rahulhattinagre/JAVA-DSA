
import java.util.*;

public class MoveZerosATLast {

    public static void main(String args[]) {
        int arr[] = {0, 1, 0, 3, 12, 2};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int x, y = 0;
        for (x = 0; x < arr.length; x++) {
            if (arr[x] != 0) {
                arr[y] = arr[x];
                y++;
            }
        }
        while (y < arr.length) {
            arr[y] = 0;
            y++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
