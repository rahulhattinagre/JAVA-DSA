import java.util.Scanner;

public class TwoDArray {
    public static void search(int matrix[][],int key){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        boolean found=false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Key is found :("+i+", "+j+")");
                    found=true;
                }
                if((largest<matrix[i][j])){
                    largest=matrix[i][j];

                }if(smallest>matrix[i][j]){
                    smallest=matrix[i][j];
                }
            }
        }
        if(!found){
            System.out.println("Key ! found");
        }
        System.out.println("smallest number is :"+smallest);
        System.out.print("Largest  number is :"+largest);
    }

    public static void main(String[] args) {
        int matrix[][]=new int[4][3];
        int n=matrix.length,m=matrix[0].length;

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the key for search : ");
        int key=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");    
            }
            System.out.println();
        }
        search(matrix, key);
    }
}
