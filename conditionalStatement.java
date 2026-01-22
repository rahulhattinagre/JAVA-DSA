import java.util.Scanner;

public class conditionalStatement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       /* int a= sc.nextInt();
        int b=sc.nextInt();

        if(a==b){
            System.out.println("a & b are Equal");
        }else if(a>=b){
            System.out.println("a is Greater then b");
            }else{
            System.out.println("b is greater then a");
            }
        }*/
       System.out.println("Enter the number of the month ");
      int Num=sc.nextInt();
      switch(Num){
        case 1:
            System.out.println("Janury");
            break;
        case 2:
            System.out.println("Febury");
            break;
        case 3:
            System.out.println("March");
            break;
        case 4:
            System.out.println("April");
            break;
        case 5:
            System.out.println("May");
            break;
        case 6:
            System.out.println("June");
            break;
        case 7:
            System.out.println("July");
            break;
        case 8:
            System.out.println("August");
            break;
        case 9:
            System.out.println("September");
            break;
        case 10:
            System.out.println("Oct");
            break;
        case 11:
            System.out.println("Nov");
            break;
        case 12:
            System.out.println("Dec");
            break;
        default:
            System.out.println("Invalid Input");
      }
    }
}
