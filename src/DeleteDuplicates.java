public class DeleteDuplicates {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode result = deleteDuplicates(node1);

        // Print the result
        printList(result);
    }
    public static ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null){
            return head ;
        }

        ListNode curr = head ;


        while(curr != null && curr.next != null){

            if(curr.val == curr.next.val){
                curr.next = curr.next.next ;
            }else{
                curr = curr.next ;
            }
        }

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
// Question Link -> https://leetcode.com/problems/remove-duplicates-from-sorted-list/