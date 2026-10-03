public class Solution {
    public static ListNode head;
    public static ListNode next;

    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
            if(slow==fast){
                return true;
            }
        }
        return false;
        
    }
}
