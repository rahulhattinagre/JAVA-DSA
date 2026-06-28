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
public static void main(String[]args){
    head=new node(1);
    node temp=new node(2);
    head.next=temp;
    head.next.next=new node(3);
    head.next.next.next=temp;
    System.out.println(isCycle());
    removeCycle();
    System.out.println(isCycle());

} 
}
