public class LinkedList {
    public static node head;
    public static node tail;
    public static class node{
        int data;
        node next;
        //constructor
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data){
        //step1:create new node
        node newNode=new node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    public void addLast(int data){
        //step1:create new node
        node  newNode=new node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void print(){
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println("Linked List after adding elements at the beginning:");
        ll.print();
         ll.addLast(3);
        ll.addLast(4);
        System.out.println("Linked List after adding elements at the end:");
        ll.print();
    } 
}
