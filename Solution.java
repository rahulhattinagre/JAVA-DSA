import java.util.Scanner;

class Solution {
    public static int searchInsert(int[] nums, int target) {
        int start=0, end=nums.length-1;
        while(start<=end){
            int mid=(start+ end)/2;
     if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                //right side
                start=mid+1;
            }else{//left
                end=mid-1;
            }
        } 
           
        return start;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size=sc.nextInt();
        int nums[]=new int[size];

        System.out.print("Enter a Number : ");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter a target : ");
        int target=sc.nextInt();
        System.out.println(searchInsert(nums,target));
        }
    }
