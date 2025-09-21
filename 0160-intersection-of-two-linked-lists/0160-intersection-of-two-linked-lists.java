/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0, sizeB = 0;
        ListNode tempA = headA, tempB = headB;
        while(tempA != null) {
            tempA = tempA.next;
            sizeA++;
        }
        while(tempB != null) {
            tempB = tempB.next;
            sizeB++;
        }

        int diff = Math.abs(sizeA - sizeB);
        
        tempA = headA;
        tempB = headB;

        if(sizeA > sizeB) {
            while(diff-- > 0) {
                tempA = tempA.next;
            }
        } else {
            while(diff-- > 0) {
                tempB = tempB.next;
            }
        }

        while(tempA != null && tempB != null) {
            if(tempA == tempB) {
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return null;
    }
}