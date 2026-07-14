
import java.util.Deque;
import java.util.LinkedList;

public class StackQueueUsingDeque {

    static class Stack {

        Deque<Integer> d = new LinkedList<>();

        public void push(int data) {
            d.addLast(data);
        }

        public int pop() {
            return d.removeLast();   // Correct
        }

        public int peek() {
            return d.getLast();
        }
    }

    static class Queue {

        Deque<Integer> q = new LinkedList<>();

        public void add(int data) {
            q.addLast(data);
        }

        public int remove() {
            return q.removeFirst();
        }

        public int peek() {
            return q.getFirst();   // Correct
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Peek: " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
