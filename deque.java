
import java.util.*;
public class Deque {

    public static void main(String args[]) {
        Deque<Integer> q = new LinkedList<>();
        q.addFirst(4);
        q.addFirst(3);
        q.addFirst(2);
        q.addFirst(1);

        q.addLast(5);
        q.addLast(6);
        q.removeFirst();

        while (!q.isEmpty()) {
            System.out.print(q.remove());
        }
        System.out.println();
    }
}
