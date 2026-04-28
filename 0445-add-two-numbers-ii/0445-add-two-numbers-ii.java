class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();

        while(l1 != null) {
            lst1.add(l1.val);
            l1 = l1.next;
        }

        while(l2 != null) {
            lst2.add(l2.val);
            l2 = l2.next;
        }

        List<Integer> lst3 = new ArrayList<>();
        int i = lst1.size() - 1, j = lst2.size() - 1;
        int carry = 0;
        while(i >= 0 && j >= 0) {
            int sum = lst1.get(i) + lst2.get(j) + carry;
            int rem = sum % 10;
            carry = sum / 10;

            lst3.add(rem);

            i--;
            j--;
        }

        while(i >= 0) {
            int sum = lst1.get(i) + carry;
            int rem = sum % 10;
            carry = sum / 10;
            lst3.add(rem);
            i--;
        }

        while(j >= 0) {
            int sum = lst2.get(j) + carry;
            int rem = sum % 10;
            carry = sum / 10;
            lst3.add(rem);
            j--;
        }

        if(carry != 0 && i < 0 && j < 0) {
            lst3.add(carry);
        }

        ListNode ans = new ListNode(0);
        ListNode trk = ans;

        int idx = lst3.size() - 1;
        while(idx >= 0) {
            ListNode temp = new ListNode(lst3.get(idx));
            trk.next = temp;
            trk = trk.next;
            idx--;
        }

        return ans.next;
    }
}