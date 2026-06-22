public class SecondMax {

    public static int secMax(int nums[]) {
        int largest = Integer.MIN_VALUE;

        // Find largest element
        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }

        // Find second largest element
        int secLargest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > secLargest && nums[i] != largest) {
                secLargest = nums[i];
            }
        }

        return secLargest;
    }

    public static void main(String[] args) {
        int nums[] = {3, 3, 5, 1};

        int result = secMax(nums);

        System.out.println("Second Maximum number: " + result);
    }
}