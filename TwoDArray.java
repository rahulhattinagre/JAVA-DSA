import java.util.Scanner;
import java.util.*;

public class TwoDArray {
 matrix as output for a given matrix of numbers. 
       public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row=sc.nextInt();
        int cols=sc.nextInt();

        int[][] number=new int[row][cols];

        for(int i=0;i<row;i++){
            for(int j=0;i<=cols;j++){
                number[i][j]=sc.nextInt();
            }
        }
        int row_start=0;
        int row_end=1;
        int cols_start=0;
        int cols_end=1;
            
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
       }
}

