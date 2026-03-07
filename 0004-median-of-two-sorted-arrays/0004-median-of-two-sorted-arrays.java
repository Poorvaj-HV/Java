class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int mergedArr[] = new int[nums1.length + nums2.length];
        int n = mergedArr.length;
        int k = 0, i = 0, j = 0;

        while(i != nums1.length && j != nums2.length) {
            if(nums1[i] <= nums2[j]) {
                mergedArr[k++] = nums1[i++];
            } else {
                mergedArr[k++] = nums2[j++];
            }
        }

        while(i != nums1.length) {
            mergedArr[k++] = nums1[i++];
        }
        while(j != nums2.length) {
            mergedArr[k++] = nums2[j++];
        }

        return (n % 2 == 0) ? (double)(mergedArr[(n/2) - 1] + mergedArr[n/2]) / 2 : mergedArr[n/2];
    }
}