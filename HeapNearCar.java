
import java.util.*;

public class HeapNearCar {

    static class Points implements Comparable<Points> {

        int x;
        int y;
        int distsq;
        int indx;

        public Points(int x, int y, int distsq, int indx) {
            this.x = x;
            this.y = y;
            this.distsq = distsq;
            this.indx = indx;
        }

        @Override
        public int compareTo(Points p2) {
            return this.distsq - p2.distsq;
        }
    }

    public static void main(String args[]) {
        int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        PriorityQueue<Points> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int distsq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Points(pts[i][0], pts[i][1], distsq, i));
        }
        //nearest k point
        for (int i = 0; i < k; i++) {
            System.out.println("c" + pq.remove().indx);
        }
    }
}
