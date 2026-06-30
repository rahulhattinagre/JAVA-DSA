public class LinkedList2 {
    public static node head;
    public static node next;
    public static int size;
    public static class node{
        int data;
        node next;
        //constructor
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
//linked list Cycle /loop
public static boolean isCycle(){
    node slow=head;
    node fast=head;
    while(fast!=null&& fast.next!=null){
        slow=slow.next;//+1
        fast=fast.next.next;//+2
        if(slow==fast){
            return true;
        }
    }
    return false;
} 
public static void removeCycle(){
    //detect cycle
    node slow=head;
    node fast=head;
    boolean cycle=false;
    while(fast!=null ||fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            cycle=true;
            break;
        }
    }
    if(cycle==false){
    return;
    }
    //find meeting point
    slow=head;
    node prev=null;//last node
    while(slow!=fast){
        slow=slow.next;
        fast=fast.next;
        prev=fast;
    }
    //remove cycle
    prev.next=null;
}
public static void print() {
    if (head == null) {
        System.out.println("Linked List is empty");
        return;
    }

    node temp = head;

    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }

    System.out.println("null");
}
// merge sort linked list
    public node getmid(node head){
        node slow=head;
        node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private node merge(node head1, node head2) {

    node mergeLL = new node(-1);   // dummy node
    node temp = mergeLL;

    while (head1 != null && head2 != null) {

        if (head1.data <= head2.data) {
            temp.next = head1;
            head1 = head1.next;
        } else {
            temp.next = head2;
            head2 = head2.next;
        }

        temp = temp.next;
    }

    while (head1 != null) {
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
    }

    while (head2 != null) {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
    }
    return mergeLL.next;
}
        public node mergesort(node head){
            if(head==null || head.next==null){
                return head;
            }
            node mid=getmid(head);
            node righthead=mid.next;
            mid.next=null;

            node newleft=mergesort(head);
            node newright=mergesort(righthead);
            
            return merge(newleft,newright); 

        }
public static void main(String[]args){
    head=new node(5);
   // node temp=new node(4);
   // head.next=temp;
   head.next=new node(4);
    head.next.next=new node(3);
    head.next.next.next=new node(2);
    head.next.next.next.next=new node(1);
    //head.next.next.next=temp;
   // System.out.println(isCycle());
   // removeCycle();
   // System.out.println(isCycle());

    System.out.println("original List:");
   print();
   LinkedList2 list = new LinkedList2();
    head = list.mergesort(head);

    System.out.println("Sorted List:");
    print();

} 
}
