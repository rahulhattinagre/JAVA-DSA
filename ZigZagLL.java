public class ZigZagLL {

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
    //zigzag
    public  void zigZag(){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        //reverse 2half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //alternate merge
        Node lefthead=head;
        Node righthead=prev;
        Node nextR,nextL;
        while(lefthead!=null && righthead!=null){
            nextL=lefthead.next;
            lefthead.next=righthead;
            nextR=righthead.next;
            righthead.next=nextL;

            lefthead=nextL;
            righthead=nextR;
        }
    }

      public static void main(String[] args) {

        ZigZagLL ll = new ZigZagLL();
        ll.addLast(1);  
        ll.addLast(2);  
        ll.addLast(3);  
        ll.addLast(4);  
        ll.addLast(5);  
        ll.addLast(6);  
        ll.print();
        ll.zigZag();
        ll.print();
   
      }
}
