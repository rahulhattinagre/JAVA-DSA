public class Nqueen{
    public static boolean isSafe(int board[][],int row,int col){
    //vertcal up
    for(int i=row-1;i>=0;i--){
        if(board[i][col]=="Q"){
            return false;
        }
    }
        //diagonal left
        for(int i=row-1;int j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=="Q"){
                return false;
            }
        }
        //diagonal right
    for(int i=row-1;int j=col+1;i>=0 && j<board.length;i--,j++){
        if(board[i][j]=="Q"){
                return false;
            }
    }
        return true;
    }
    public static void nQueen(int board[][],int row){
        if(row==board.length){
            printboard(board);
            return;
        }
        for(int j=0;j<n;j++){
            board[row][j]="Q";
            nQueen(board,row+1);
            board[row][j]="X";
        }
        public static void print(char board[][]){
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    System.out.print(board[i][i],+" ");
                }
            }
            Syste.out.println();
        }
        public static void main(String[] args){
            int n=4;
            char board[][]=new char[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    board[i][j]="X";
                }
            }
            nQueen(board,0);      
    }
        
