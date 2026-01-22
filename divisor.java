//Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
import java.util.Scanner;

public class divisor {
    public static int commonDivisor(int a,int b) {
        while (b!=0) {
            int remainder=a%b;
            a=b;
            b=remainder;   
        } 
        return a;  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int Result=commonDivisor(a,b);
        System.out.println("gdc  "+a+" and " +b+" = "+Result);

        
    }
    
}
