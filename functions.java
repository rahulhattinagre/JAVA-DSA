import java.util.Scanner;

public class functions {
    /*public static int calculateSum(int a, int b){
        int sum=a+b;
        return sum;
    }*/
   public static int calculateMul(int a,int b){
    return a*b;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Multipication of Two number : "+calculateMul(a, b)); 
    }
    
}
