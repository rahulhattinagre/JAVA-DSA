public class pattern2 {
    public static void main(String[] args) {
         /*int n=4;
       for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print( "  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println( );
    }*/

    // dimond pattern
    int m=4;
    for(int i=1;i<=m;i++){
        for(int j=1;j<=m-i;j++){
            System.out.print(" ");
        } 
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=m;i>=1;i--){
        for(int j=1;j<=m-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
