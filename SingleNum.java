public class SingleNum {
    public void singleNumber(int nums[]){
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        System.out.println("The single number is: " + xor);

    }
    public static void main(String args[]){
        int nums[]={1,2,2,3,4,4,1};
        SingleNum sn=new SingleNum();
        sn.singleNumber(nums);
    }
    
}
