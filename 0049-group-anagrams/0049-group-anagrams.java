class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        
        for(String str: strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            String temp = new String(ch);

            if(hm.containsKey(temp)) {
                hm.get(temp).add(str);
            } else {
                hm.put(temp, new ArrayList<>());
                hm.get(temp).add(str);
            }
        }
        
        List<List<String>> l = new ArrayList<>();
        for(List<String> group: hm.values()) {
            l.add(group);
        }

        return l;
    }
}