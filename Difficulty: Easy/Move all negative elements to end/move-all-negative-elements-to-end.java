// class Solution {
//     public void segregateElements(int[] arr) {
//         int n = arr.length;
        
//         int left = 0, right = 0;
        
//         while(right < n) {
//             if(arr[right] > 0) {
//                 int temp = arr[right];
//                 arr[right] = arr[left];
//                 arr[left] = temp;
//                 left++;
//             }
//             right++;
//         }
//     }
// }

class Solution {
    public void segregateElements(int[] arr) {
        int n = arr.length;
        // Create a temporary array to store results
        int[] temp = new int[n];
        int j = 0;

        // Step 1: Add all positive integers (>= 0) in their original order
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[j++] = arr[i];
            }
        }

        // Step 2: Add all negative integers (< 0) in their original order
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[j++] = arr[i];
            }
        }

        // Step 3: Copy the sorted elements back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
