public class LinkedList {

    public static Node head;
    public static Node tail;
    public static int size;

    // Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Print Linked List
    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Remove first node
    public int removeFirst() {

        if (head == null) {
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;

        return val;
    }

    // Remove last node
    public int removeLast() {

        if (head == null) {
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;

        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = tail.data;
        tail = prev;
        tail.next = null;
        size--;

        return val;
    }

    // Main method
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);

        System.out.println("Linked List after addFirst:");
        ll.print();

        ll.addLast(3);
        ll.addLast(4);

        System.out.println("Linked List after addLast:");
        ll.print();

        System.out.println("Removed First: " + ll.removeFirst());

        System.out.println("Linked List:");
        ll.print();

        System.out.println("Removed Last: " + ll.removeLast());

        System.out.println("Linked List:");
        ll.print();

        System.out.println("Size of Linked List: " + size);
    }
}
