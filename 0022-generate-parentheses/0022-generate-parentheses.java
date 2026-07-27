class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        generate(0, 0, new StringBuilder(), n, result);

        return result;
    }

    public void generate(int countOpen, int countClose, StringBuilder sb, int n, List<String> result) {
        if(sb.length() == 2*n) {
            result.add(sb.toString());
            return;
        }

        if(countOpen < n) {
            generate(countOpen + 1, countClose, sb.append("("), n, result);
            sb.deleteCharAt(sb.length()-1);
        }
        
        if(countClose < countOpen) {
            generate(countOpen, countClose + 1, sb.append(")"), n, result);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}