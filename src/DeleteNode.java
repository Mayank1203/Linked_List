import ListNodePublicClass.ListNode;

public class DeleteNode {
    public static void main(String[] args) {
        // Create linked list: 4 -> 5 -> 1 -> 9
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        DeleteNode solution = new DeleteNode();
        System.out.println("Original List:");
        solution.printList(head); // Delete node with value 5 (we pass reference to node '5')

        solution.deleteNode(head.next);

        System.out.println("After deleting node 5:");
        solution.printList(head);
    }

    public static void deleteNode(ListNode node) {
        ListNode prev = null;

        while (node != null && node.next != null) {
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }

        if (node != null) {
            if (prev != null)
                prev.next = null;
            else
                node = null;
        }
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

// Question Link -> https://leetcode.com/problems/delete-node-in-a-linked-list/
