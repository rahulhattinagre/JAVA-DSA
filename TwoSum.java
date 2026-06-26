import java.util.HashMap;

public class TwoSum {
    public static int[] twosum(int nums[],int target){
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remaining=target-nums[i];
             // Check if required number already exists
            if(map.containsKey(remaining)){
                return new int[] {map.get(remaining),i};
            }
                map.put(nums[i],i);
            }
            return new int[]{-1,-1};
        }
    public static void main(String[]args){
        int nums[]={1,6,2,10,3};
        int target=7;
        int[] ans=twosum(nums, target);
        System.out.print("["+ans[0]+","+ans[1]+"]");
    }
    
}
