public class RemoveDuplicateArray {
    public static int removeDuplicate(int nums[]) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 3, 3, 4, 4, 5};

        int ans = removeDuplicate(nums);

        System.out.println("The length of the array after removing duplicates is " + ans);
        // Print unique elements
        for (int i = 0; i < ans; i++) {
            System.out.print(nums[i] + " ");
        }
    }
  
}
