interface Chessboard{
    void moves();//abstraction;
}
class Queen implements Chessboard{
    public void moves(){
        System.out.println("UP,DOWN,LEFT,RIGHT,DIAGONAL  -(IN All 4 dirns)");
    }
}
class Rook implements Chessboard{
    public void moves(){
        System.out.println("UP,DOWN,LEFT,RIGHT");
    }
}
class King implements Chessboard{
    public void moves(){
        System.out.println("UP,DOWN,LEFT,RIGHT");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Queen q1=new Queen();
        q1.moves();

        Rook r1=new Rook();
        r1.moves();

        King k1=new King();
        k1.moves();
    }
}
