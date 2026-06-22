    public class SecondSmallest {
        public static int largestElement(int nums[]){
            int ssmallest=Integer.MAX_VALUE;
            for(int i=0;i<=nums.length-1;i++){
                if(ssmallest > nums[i]){
                    ssmallest=nums[i];
                }
            }
            int secmin=Integer.MAX_VALUE;
            for(int i=0;i<=nums.length-1;i++){
                if(nums[i]< secmin && nums[i]!=ssmallest){
                    secmin=nums[i];
                }
            }
        
            return secmin;
        }
        public static void main(String []args){
            int nums[]={3,3,6,1};
            SecondSmallest p=new SecondSmallest();
            int ans=p.largestElement(nums);
            System.out.println("Second smallest element is "+ans);
        }
    }