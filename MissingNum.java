public class MissingNum {
    public static int missingNumber(int nums[]){
        int n=nums.length;
        int totalSum=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        return totalSum-sum;
        
    }
    
    public static void main(String[]args){
        int nums[]={0,1,2,4,5,6};
        int missing=missingNumber(nums);
        System.out.println("The missing number is: " + missing);
    }
}
