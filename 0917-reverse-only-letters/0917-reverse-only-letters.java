class Solution {
    public String reverseOnlyLetters(String s) {
        char[] result = s.toCharArray();
        int i = 0;
        int j = result.length - 1;

        while(i <= j) {
            if(!Character.isLetter(result[i])) {
                i++;
            } else if(!Character.isLetter(result[j])) {
                j--;
            } else {
                char temp = result[i];
                result[i] = result[j];
                result[j] = temp;
                i++;
                j--;
            }
        }

        return new String(result);
    }
}