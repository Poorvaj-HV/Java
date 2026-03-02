class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        for(Integer i: nums1) {
            hs.add(i);
        }

        for(Integer i: nums2) {
            if(hs.contains(i)) {
                resultSet.add(i);
            }
        }

        int resultArr[] = new int[resultSet.size()];
        int idx = 0;
        for(Integer i: resultSet) {
            resultArr[idx++] = i;
        }

        return resultArr;
    }
}