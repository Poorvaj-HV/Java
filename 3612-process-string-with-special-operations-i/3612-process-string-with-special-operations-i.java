class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();

        for(char x : s.toCharArray()) {
            if(x == '*' && sb.length() != 0) {
                sb.deleteCharAt(sb.length() - 1);
            } else if(x == '#') {
                sb.append(sb);
            } else if(x == '%') {
                sb.reverse();
            } else if(x >= 'a' && x <= 'z') {
                sb.append(x);
            }
        }

        return sb.toString();
    }
}