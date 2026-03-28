class Solution {
    public int compress(char[] chars) {
        int left = 0, right = 0;
        int count = 0;
        int idx = 0;
        while(right < chars.length) {
            if(chars[left] == chars[right]) {
                count++;
                right++;
            } else {
                chars[idx++] = chars[left];
                if(count > 1) {
                    for(char ch: String.valueOf(count).toCharArray()) {
                        chars[idx++] = ch;
                    }
                }
                count = 1;
                left = right;
                right++;
            }
        }

        chars[idx++] = chars[left];
        if(count > 1) {
            for(char ch: String.valueOf(count).toCharArray()) {
                chars[idx++] = ch;
            }
        }

        return idx;
    }
}