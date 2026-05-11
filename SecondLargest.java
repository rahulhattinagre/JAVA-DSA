class SecondLargest {
    public int secondLargestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > largest) {
                secondlargest = largest;
                largest = nums[i];
            } 
            else if(nums[i] > secondlargest && nums[i] != largest) {
                secondlargest = nums[i];
            }
        }

        return secondlargest;
    }
}