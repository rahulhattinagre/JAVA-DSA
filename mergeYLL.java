
public class mergeYLL {

    // Node class
    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Brute-force method to find intersection
    public Node getIntersectionNode(Node head1, Node head2) {

        while (head2 != null) {

            Node temp = head1;

            while (temp != null) {

                if (temp == head2) {   // Compare node references
                    return head2;
                }

                temp = temp.next;
            }

            head2 = head2.next;
        }

        return null;
    }

    // Print a linked list
    public void print(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        mergeYLL list = new mergeYLL();

        // List 1
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        // List 2
        Node head2 = new Node(4);
        head2.next = new Node(5);

        // Common Part
        Node common = new Node(6);
        common.next = new Node(7);

        // Connect both lists to the common part
        head1.next.next.next = common; // 3 -> 6
        head2.next.next = common;      // 5 -> 6

        // Print lists
        System.out.println("First Linked List:");
        list.print(head1);

        System.out.println("Second Linked List:");
        list.print(head2);

        // Find intersection
        Node intersectionPoint = list.getIntersectionNode(head1, head2);

        if (intersectionPoint == null) {
            System.out.println("No Intersection Point");
        } else {
            System.out.println("Intersection Point : " + intersectionPoint.data);
        }
    }
}
