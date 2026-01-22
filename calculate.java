import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Two Number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition of a & b : "+(a+b));
        System.out.println("Subtraction of a & b : "+(a-b));
        System.out.println("Multipication of a & b : "+(a*b));
        System.out.println("Division of a & b : "+(a/b));
        System.out.println("Modulo of a & b : "+(a%b));
    }
    
}
