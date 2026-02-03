import java.util.Scanner;

public class binarySearch {
    public static int binarySearch(int []nums,int key) {
        int start=0 , end=nums.length-1;
        while (start<=end) {
            int mid=(start+end)/2;

            if(nums[mid]==key){
                return mid;
            }
            if(nums[mid]<key){//right side
                start=mid+1;
            }else{
                //left
                end=mid-1;
            }
        }
        return -1;  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int[size];

        System.out.print("Enter a Number : ");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter Search a Key : ");
        int key=sc.nextInt();
        System.out.println("Key found at index at : "+binarySearch(nums,key));
    }
    
}
