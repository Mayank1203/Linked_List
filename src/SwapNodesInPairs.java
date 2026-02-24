import ListNodePublicClass.ListNode;

public class SwapNodesInPairs {

    public static void main(String[] args) {
        SwapNodesInPairs sol = new SwapNodesInPairs();

        // Creating list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        System.out.print("Original List: ");
        sol.printList(head);

        ListNode result = sol.swapPairs(head);

        System.out.print("Swapped List:  ");
        sol.printList(result);
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public ListNode swapPairs(ListNode head) {
        // Base case: if list has 0 or 1 node, no swapping needed
        if (head == null || head.next == null) {
            return head;
        }

        // Nodes to be swapped
        ListNode firstNode = head;
        ListNode secondNode = head.next;

        // Swapping logic
        // The first node points to the result of the next recursive swap
        firstNode.next = swapPairs(secondNode.next);
        // The second node now points to the first node
        secondNode.next = firstNode;

        // Now secondNode is the new head of this pair
        return secondNode;
    }
}


// Question Link -> https://leetcode.com/problems/swap-nodes-in-pairs/