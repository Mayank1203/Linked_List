import ListNodePublicClass.ListNode;

public class RemoveNthFromEnd {

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

        int n = 2 ;

        ListNode result = removeNthFromEnd(node1, n);

        // Print the result
        printList(result);
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null ;
        }

        int size = 0 ;
        ListNode curr = head ;
        while(curr != null){
            curr = curr.next ;
            size++;
        }

        if(n == size){
            return head.next;
        }

        int indexToSearch = size - n ;
        ListNode prev = head ;
        curr = head;
        int i = 1;
        while(i < indexToSearch){
            prev = prev.next ;
            i++;
        }

        prev.next = prev.next.next ;
        return head ;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
// Question Link -> https://leetcode.com/problems/remove-nth-node-from-end-of-list/