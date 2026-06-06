class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;

        while(i >= 0 && j >= 0) {
            int n1 = Character.getNumericValue(num1.charAt(i));
            int n2 = Character.getNumericValue(num2.charAt(j));

            int sum = n1 + n2 + carry;
            int rem = sum % 10;
            sb.insert(0, rem);
            carry = sum / 10;
            i--;
            j--;
        }

        while(i >= 0) {
            int val = Character.getNumericValue(num1.charAt(i));
            int sum = val + carry;
            int rem = sum % 10;
            carry = sum / 10;
            sb.insert(0, rem);
            i--;
        }

        while(j >= 0) {
            int val = Character.getNumericValue(num2.charAt(j));
            int sum = val + carry;
            int rem = sum % 10;
            carry = sum / 10;
            sb.insert(0, rem);
            j--;
        }

        if(i < 0 && j < 0 && carry != 0) {
            sb.insert(0, carry);
        }

        return sb.toString();
    }
}