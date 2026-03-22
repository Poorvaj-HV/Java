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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;
        ArrayList<Integer> al = new ArrayList<>();
        while(temp != null) {
            al.add(temp.val);
            temp = temp.next;
        }

        Collections.sort(al);

        temp = head;
        int i = 0;
        while(temp != null) {
            temp.val = al.get(i++);
            temp = temp.next;
        }

        // while(t1 != null) {
        //     ListNode t2 = t1.next;
        //     while(t2 != null) {
        //         if(t1.val > t2.val) {
        //             int temp = t1.val;
        //             t1.val = t2.val;
        //             t2.val = temp;
        //         }
        //         t2 = t2.next;
        //     }
        //     t1 = t1.next;
        // }

        return head;
    }
}