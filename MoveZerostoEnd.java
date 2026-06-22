public class MoveZerostoEnd {
    public static void mZerotoEnd(int nums[]) {
        int temp[] = new int[nums.length]; // store non-zero values
        int k = 0; // index for temp

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp[k] = nums[i];
                k++;
            }
        }

        // copy temp into original array
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        // fill remaining positions with 0
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 0, 3, 0, 4, 8, 4, 0};

        mZerotoEnd(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
