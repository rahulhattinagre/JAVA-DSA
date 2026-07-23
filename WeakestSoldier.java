
import java.util.PriorityQueue;

public class WeakestSoldier {

    static class weak implements Comparable<weak> {

        int i = 0;
        int indx = 0;

        public weak(int i, int indx) {
            this.i = i;
            this.indx = indx;
        }

        @Override
        public int compareTo(weak w1) {
            if (this.i == w1.i) {
                return this.indx - w1.indx;
            } else {
                return this.i - w1.i;
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 0, 0, 0},
        {1, 1, 1, 1},
        {1, 0, 0, 0},
        {1, 0, 0, 0}};
        int k = 2;
        PriorityQueue<weak> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[0].length; j++) {
                count += arr[i][j] == 1 ? 1 : 0;
            }
            pq.add(new weak(count, i));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("R" + pq.remove().indx);
        }
    }
}
