import ListNodePublicClass.ListNode;

public class MiddleNode {

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

        System.out.println("Middle Node : " + middleNode(node1).val);

    }
    public static ListNode middleNode(ListNode head) {
        ListNode fast = head ;
        ListNode slow = head ;

        while(fast != null && fast.next != null){
            fast = fast.next.next ;
            slow = slow.next ;
        }

        return slow ;

    }
}
// Question Link -> https://leetcode.com/problems/middle-of-the-linked-list/