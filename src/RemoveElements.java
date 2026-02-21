import ListNodePublicClass.ListNode;

public class RemoveElements {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        int n = 6 ;

        System.out.println("Original List: " );
        printList(node1);

        ListNode result = removeElements(node1, n);
        System.out.println("\nAfter removing elements: ");

        // Print the result
        printList(result);


    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        // Create a dummy node to handle cases where the head needs to be removed
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr = dummy;
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
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

// Question List -> https://leetcode.com/problems/remove-linked-list-elements/