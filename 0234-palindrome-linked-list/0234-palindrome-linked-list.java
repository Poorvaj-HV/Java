class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }

        //find mid
        ListNode midNode = findMid(head);

        //Reverse 2nd half
        ListNode prev = midNode;
        ListNode curr = midNode.next;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        midNode.next = null;
        ListNode right = prev; //right half head
        ListNode left = head;

        while(right != null) {
            if(left.val != right.val) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }

    public ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}