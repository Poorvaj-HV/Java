class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> hm = new HashMap<>(Map.ofEntries(
            Map.entry(1, "I"),
            Map.entry(4, "IV"),
            Map.entry(5, "V"),
            Map.entry(9, "IX"),
            Map.entry(10, "X"),
            Map.entry(40, "XL"),
            Map.entry(50, "L"),
            Map.entry(90, "XC"),
            Map.entry(100, "C"),
            Map.entry(400, "CD"),
            Map.entry(500, "D"),
            Map.entry(900, "CM"),
            Map.entry(1000, "M")
        ));
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        StringBuilder sb = new StringBuilder();
        int pos = 1;

        while(num != 0) {
            int r = num % 10;
            num /= 10;

            int value = r * pos;
            pos *= 10;
            if(hm.containsKey(value)) {
                sb.insert(0, hm.get(value));
            } else {
                int copy = value;
                int i = values.length - 1;
                StringBuilder s = new StringBuilder();
                while(i >= 0) {
                    if(copy >= values[i]) {
                        s.append(hm.get(values[i]));
                        copy -= values[i];
                    } else {
                        i--;
                    }

                    if(copy == 0) {
                        sb.insert(0, s);
                        break;
                    }
                }
            }
        }

        return sb.toString();
    }
}