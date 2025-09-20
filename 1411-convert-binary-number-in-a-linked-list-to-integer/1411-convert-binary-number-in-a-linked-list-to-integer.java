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
    public int getDecimalValue(ListNode head) {
        // StringBuilder str = new StringBuilder("");

        // ListNode temp = head;
        // while(temp != null) {
        //     str.append(temp.val);
        //     temp = temp.next;
        // }
        // String st = str.toString();

        // int pos = 1;
        // int result = 0;
        // for(int i=st.length()-1; i>=0; i--) {
        //     result += Integer.parseInt(String.valueOf(st.charAt(i))) * pos;
        //     pos *= 2;
        // }

        int size = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }

        temp = head;
        int ans = 0;
        while(temp != null) {
            size--;
            ans += (temp.val * Math.pow(2, size));
            temp = temp.next;
        }

        return ans;
    }
}