class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        generate(0, 0, "", n, result);

        return result;
    }

    public void generate(int countOpen, int countClose, String str, int n, List<String> result) {
        if(str.length() == 2*n) {
            result.add(str);
            return;
        }

        if(countOpen < n) {
            generate(countOpen + 1, countClose, str + "(", n, result);
        }
        
        if(countClose < countOpen) {
            generate(countOpen, countClose + 1, str + ")", n, result);
        }
    }
}