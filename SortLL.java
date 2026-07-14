
public class SortLL {

    public static node head;
    public static node tail;

    static class node {

        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }

        public static void sortlist(node head) {

        }

        public static node findMid(node head) {
            node slow = head;
            node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

    }
    public static void main(String[] args) {
        
    }

}
