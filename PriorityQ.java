
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQ {

    static class Student implements Comparable<Student> {

        String name;
        int rank;//so i want a priority based on rank nut how to compare the object of class then i want to implement /override a obj of class comparable and by using a compareTo() function  

        //constructor
        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        //overide 
        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());//Comparator.reverseOrder()
        pq.add(new Student("Rahul", 5));//O(log n)
        pq.add(new Student("rohit", 3));
        pq.add(new Student("raj", 4));
        pq.add(new Student("Om", 1));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank); //O(1)
            pq.remove();//O(log n)
        }
    }
}
