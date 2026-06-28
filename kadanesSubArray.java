public class kadanesSubArray {

    public static int subArray(int nums[]){
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            maxsum=Math.max(maxsum,sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxsum; 
        }
        public static void main(String[]args){
            int nums[]={2, 3, 5, -2, 7, -4};
           System.out.print(subArray(nums));
        }
}