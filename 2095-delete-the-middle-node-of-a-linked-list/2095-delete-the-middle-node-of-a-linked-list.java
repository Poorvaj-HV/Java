class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) {
            head = null;
            return head;
        }

        ListNode prev = findMid(head);
        prev.next = prev.next.next;

        return head;
    }

    public ListNode findMid(ListNode head) {
        ListNode slow = head, fast = head;
        ListNode prev = slow;

        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        return prev;
    }
}