class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        // Dummy node handles the case where 'left' is the head (1st node)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;

        // 1. Move 'pre' to the node right before the reversal starts
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }

        // 2. Reverse the sub-list
        ListNode start = pre.next; // The first node of the segment to be reversed
        ListNode then = start.next; // The node we are currently moving

        // Standard "moving" reversal: 1 -> 2 -> 3  becomes  2 -> 1 -> 3
        for (int i = 0; i < right - left; i++) {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }

        return dummy.next;
    }
}