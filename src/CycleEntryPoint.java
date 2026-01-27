//public class ListNode{
//    int val ;
//    ListNode next;
//    ListNode(int val){
//        this.val = val ;
//        this.next = null;
//    }
//}

public class CycleEntryPoint {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3;

        System.out.println(DetectCycleValue(node1).val);
    }

    public static ListNode DetectCycleValue(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        if(head==null || head.next==null){return null;}

        while(fast!= null && fast.next!=null){
            slow =slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ListNode entry = head;
                while(entry != slow){
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry;
            }
        }
        return null;
    }
}
