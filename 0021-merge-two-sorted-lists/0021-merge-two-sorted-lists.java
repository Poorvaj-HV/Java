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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sol = new ListNode();
        ListNode temp = sol;
        ListNode left = list1;
        ListNode right = list2;

        while(left != null && right != null) {
            if(left.val <= right.val) {
                temp.next = new ListNode(left.val);
                left = left.next;
            } else {
                temp.next = new ListNode(right.val);
                right = right.next;
            }
            temp = temp.next;
        }

        while(left != null) {
            temp.next = new ListNode(left.val);
            left = left.next;
            temp = temp.next;
        }

        while(right != null) {
            temp.next = new ListNode(right.val);
            right = right.next;
            temp = temp.next;
        }

        return sol.next;
    }
}