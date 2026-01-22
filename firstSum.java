import java.util.Scanner;

public class firstSum {
    public static void main(String[] args) {
       /*  int n=4;
        int sum=0;
        for(int i=1;i<=n;i++){
           sum=sum+i;
        }
         System.out.println("Sum of n:"+sum);*/

        /*  Scanner sc=new Scanner(System.in);
         int n = sc.nextInt();
         for(int i=0;i<=n;i++){
            if(i%2==0){
                System.out.println("Even Number:"+i);
            }
         }*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers, either 1 or 0 : ");
        int choice;
        do{
            System.out.println("enters 1 then keep taking input  marks(out of 100)");
            choice=sc.nextInt(); 
            if(choice == 1){
                System.out.println("Enter the Marks :");
                int marks=sc.nextInt();
                if(marks>=90){
                    System.out.println("This is Good");
                }else if(marks >= 60 ){
                    System.out.println("This is also Good");
                }else if(marks>=0){
                    System.out.println("This is Good as well");
                }else{
                    System.out.println("invalid marks");
                }

                }
            }
        
        while(choice != 0);
         System.out.println("Stop propgram");  
    }
}
