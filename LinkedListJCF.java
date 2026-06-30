import java.util.LinkedList;
public class LinkedListJCF {
    public static void main(String[]args){
    LinkedList<Integer> ll=new LinkedList<>();
    ll.addFirst(1);
    ll.addFirst(0);
    ll.addLast(2);
    ll.addLast(3);
    System.out.println(ll);
    //0->1->2->3
    ll.removeLast();
    ll.removeFirst();
    System.out.println(ll);
    //1->2->
    

    }

    
}
