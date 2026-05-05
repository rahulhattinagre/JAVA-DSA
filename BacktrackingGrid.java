public class BacktrackingGrid{
  public static int gridWaysCount(int i,int j,int n,int m){
        //base case
        if(i==n-1&& j==m-1){
            return 1;

        }else if(i==n || j==m){
            return 0;

        }
        //recurssion
        int w1=gridWaysCount(i+1, j, n, m);
        int w2=gridWaysCount(i, j+1, n, m);
        return w1 + w2;
    }
public static void main(String []args){
    int n=3, m=3;
        System.out.println(gridWaysCount(0, 0, n, m));
}
}
