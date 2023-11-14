class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode child = head.next;

        while (child != null) {
            count++;
            child = child.next;
        }
        int delete = count - n;
        while (delete < -1) {

            if(delete == 0) {
                if(head.next == null) {
                    head = null;
                } else {
                    head.next = head.next.next;
                }
            }
            delete--;

        }

        return head;
    }
}
