public class DeleteAllDLL {

    // Node class
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Delete all occurrences of target
    public void deleteAll(int target) {

        Node curr = head;

        while (curr != null) {

            Node nextNode = curr.next;

            if (curr.data == target) {

                // Deleting head
                if (curr == head) {
                    head = curr.next;

                    if (head != null) {
                        head.prev = null;
                    } else {
                        tail = null;
                    }
                }

                // Deleting middle or tail
                else {

                    curr.prev.next = curr.next;

                    if (curr.next != null) {
                        curr.next.prev = curr.prev;
                    } else {
                        tail = curr.prev;
                    }
                }

                size--;
            }

            curr = nextNode;
        }
    }

    // Print Linked List
    public void print() {

        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Main Method
    public static void main(String[] args) {

        DeleteAllDLL ll = new DeleteAllDLL();

        ll.addFirst(4);
        ll.addFirst(1);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addFirst(-1);

        System.out.println("Original Linked List:");
        ll.print();

        System.out.println("Size = " + size);

        ll.deleteAll(1);

        System.out.println("\nAfter deleting all 1's:");
        ll.print();

        System.out.println("Size = " + size);
    }
}
