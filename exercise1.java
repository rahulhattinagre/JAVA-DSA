import java.util.Scanner;

public class exercise1 {
    //Enter 3 numbers from the user & make a function to print their average.
    /*public static  void avg(int a,int b,int c) {
        int avg=(a+b+c)/3;
        System.out.println("Average of 3 Number : "+avg);
        return;
    } */

        //Write a function to print the sum of all odd numbers from 1 to n.
/*public static void sumOfOdd(int n) {
    int sum=0;
    for(int i=1;i<=n;i++){
        if(i%2!=0){
            sum =sum+i;
        }
    } 
        System.out.println("Total Sum Of odd number :"+sum);
}*/

//Write a function which takes in 2 numbers and returns the greater of those two.

        /*public static void greatestNum(int a,int b) {
            if(a>b){
                System.out.println("A is a greater number");
            }
            else if(a==b){
                System.out.println("A and B are equal number");
            }else{
                System.out.println("B is greater number ");
            }
            return;
        }*/

            //Write a function that takes in the radius as input and returns the circumference of a circle.
/*public static double circumference(double radius) {
    return 2 * Math.PI*radius;
} */

       /*  public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;
        int choice;

        do {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if (n > 0) {
                positive++;
            } else if (n < 0) {
                negative++;
            } else {
                zero++;
            }

            System.out.print("Do you want to continue? (1 = Yes, 0 = No): ");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("\nResult:");
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);
    }*/

        //Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

        public static int rised(int x,int n) {
        int Result=1;
        for(int i=1;i<=n;i++){
            Result=Result*x;
        }
        return Result;   
        }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int n=sc.nextInt();
    System.out.println(x+ " rised power: " +n+" = "+rised(x, n));

   }
}
