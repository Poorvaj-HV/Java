class Solution {
    public String finalString(String s) {
        char[] result = new char[s.length()];
        int idx = 0;

        for(int i=0; i<s.length(); i++) {
            char x = s.charAt(i);
            if(x != 'i') {
                result[i] = x;
            } else {
                reverse(result, 0, i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char x : result) {
            if(x != '\u0000') {
                sb.append(x);
            }
        }

        return sb.toString();
    }

    public void reverse(char[] arr, int sI, int eI) {
        while(sI <= eI) {
            char temp = arr[sI];
            arr[sI] = arr[eI];
            arr[eI] = temp;
            sI++;
            eI--;
        }
    }
}