
import java.util.*;

public class Histogram {

    public static void maxArea(int arr[]) {
        int maxarea = 0;
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        //next smaller right
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //next smaller left
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //calculate area of rectangle
        //current area =nsr -nsr-1
        for (int i = 0; i < arr.length; i++) {
            int hight = arr[i];
            int width = nsr[i] - nsl[i] - 1; //j-i-1
            int currarea = hight * width; // hight*(j-i-1)=currarea rec
            maxarea = Math.max(currarea, maxarea);
        }
        System.out.println("max rectagle of Hostogram :" + maxarea);

    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        maxArea(arr);
    }
}
