/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode tail = temp;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = temp.next;
        temp.next = null;
        return result;
    }
    // public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //     int n1 = reverseList(l1, 1);
    //     int n2 = reverseList(l2, 1);

    //     int sum = n1 + n2;

    //     ListNode head = null, temp = null;

    //     if(sum == 0) {
    //         ListNode newNode = new ListNode(sum);
    //         return newNode;
    //     }

    //     while(sum > 0) {
    //         int m = sum % 10;
    //         ListNode newNode = new ListNode(m);
    //         if(head == null) {
    //             head = temp = newNode;
    //         }
    //         temp.next = newNode;
    //         temp = newNode;
    //         sum /= 10;
    //     }

    //     return head;
    // }

    // public int reverseList(ListNode head, int pos) {
    //     if(head == null) {
    //         return 0;
    //     }

    //     return reverseList(head.next, pos*10) + head.val * pos;
    // }
}