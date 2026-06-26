//Longest subarray with sum K

import java.util.HashMap;

public class longestSubarraySum {
    //O(n2)
/*public int longSubarray(int nums[], int k) { 
      int len=0;
      for(int i=0;i<=nums.length;i++){
          int sum =0;
        for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
            if(sum==k){
                len=Math.max(len,j-i+1);
            }
        }
    }
        return len;
      }*/
      public static int longestSubarray(int nums[],int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k){
                maxlen=i+1;
            }
            int remaining=sum-k;
            if(map.containsKey(remaining)){
                int len=i-map.get(remaining);
                maxlen=Math.max(maxlen,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxlen;
      }
    public static void main(String[]args){
        int nums[]={10,5,2,7,1,9};
        int k=15;
        longestSubarraySum ls=new longestSubarraySum();
        int ans=ls.longestSubarray(nums,k);
        System.out.println("Longest subarray of sum is : "+ans);
        
    }
}