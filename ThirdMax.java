
public class ThirdMax {

    public static int findMax(int nums[]) {
        Long first = null;
        Long second = null;
        Long third = null;
        for (int i = 0; i < nums.length; i++) {
            if (first != null && nums[i] == first
                    || second != null && nums[i] == second
                    || third != null && nums[i] == third) {
                continue;
            }
            if (first == null || nums[i] > first) {
                third = second;
                second = first;
                first = (long) nums[i];
            } else if (second == null || nums[i] > second) {
                third = second;
                second = (long) nums[i];
            } else if (third == null || nums[i] > third) {
                third = (long) nums[i];
            }
        }
        return third == null ? first.intValue() : third.intValue();
    }

    public static void main(String[] args) {
        int nums[] = {3, 2, 2, 0};
        System.out.print(findMax(nums));
    }

}
