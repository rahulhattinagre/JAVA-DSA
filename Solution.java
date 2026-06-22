public class Solution {
    public static void leftrotate(int nums[]) {
        int temp=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
    }
        public static void main(String[] args) {
            int nums[]={1,2,3,4,5};
            leftrotate(nums);
            System.out.println("The array after left rotation is: ");
            for(int i=0;i<nums.length;i++){
                System.out.print(nums[i]+" ");
            }   
}
}