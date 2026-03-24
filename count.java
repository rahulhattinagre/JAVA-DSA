public class count { 
/*public static void main(String[] args) {
        int matrix[][]={{4,7,8},
                        {8,8,7}};
    int count=0;
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==7){
                count++;
            }
        }
    }
    System.out.println("count of 7 is : "+count);
    }*/

   //sum of second row
   /*public static void main(String[] args) {
    int matrix[][]={{1,4,9},
                    {11,4,3},
                    {2,2,3}};
    int sum =0;
    for(int j=0;j<matrix[0].length;j++){
        sum +=matrix[1][j];

    }
    System.out.println("Sum of second row : "+sum);
   }
    */

   //transpose matrix
   public static void main(String[] args) {
    int matrix[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
    int transpose[][]=new int[matrix[0].length][matrix.length];
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            transpose[j][i]=matrix[i][j];
        }
    }
    for(int i=0;i<transpose.length;i++){
        for(int j=0;j<transpose[0].length;j++){
    
   } }
}
