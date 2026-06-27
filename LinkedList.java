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
    public int itrSearch(int key){//O(n)
        Node temp =head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                //key found
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;//key not found
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int indx = helper(head.next, key);
        if(indx==-1){
            return -1;
        }
        return indx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }
    public void reverse(){//O(n)
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;//reverse
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void removeNthNode(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;//if head want to remove then removed;
            return;
        }
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next =prev.next.next;
        return;
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
        System.out.println("Size of Linked List: " + size);
       System.out.println("Found at index: "+ ll.itrSearch(3));
       System.out.println("Key Not Found: "+ll.itrSearch(11));
       System.out.println("Key Not Found: "+ll.recSearch(3));
       ll.reverse();
       ll.print();
       ll.removeNthNode(2);
       ll.print();



       

    }
}
