import java.util.Scanner;

public class arraysLs {
    public static int linearSearch(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }   
        return -1;
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] num={4,3,7,9,18,40,20,18};
        System.out.print("Enter Key : ");
        int key=sc.nextInt();
        int index=linearSearch(num, key);
        if(index == -1){
            System.out.println("Array Not Found ");
        }else{

            System.out.println("arrays is index of : "+index);
        }
    }
    
}
