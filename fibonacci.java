
import java.util.Scanner;
public class fibonacci {
    public static void fibonacciSeries(int n) {
        int a=0;
        int b=1;
        if(n>=1){
            System.out.println(a+" ");
        }
        if(n>=2){
            System.out.println(b+" ");
        }
        for(int i=3;i<=n;i++){
            int c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        fibonacciSeries(n);
        
    }
    
}
