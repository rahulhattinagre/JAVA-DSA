import java.util.Scanner;
import java.util.*;

public class TwoDArray {
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] num=new int[row][col];
        //input 
        //rowss
        for(int i=0;i<row;i++){
            //cols
            for(int j=0;j<col;j++){
                num[i][j]= sc.nextInt();
            }
        }
        System.out.print("Enter a number for search : ");
        int x=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(num[i][j]==x){
                    System.out.println("num is found :"+i+ ","+j);
         }
        }
    }*/

       // Print the spiral order matrix as output for a given matrix of numbers. 
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

