    public class practice {
        public static boolean isSorted(int nums[]){
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]>nums[i+1]){
                    return false;
                }
            }
            return true;
        }
        public static void main(String []args){
            int nums[]={9,8,7,6,4,5,6,7,8};
            practice p=new practice();
            boolean ans=p.isSorted(nums);
            System.out.println(ans);
        }
    }
            