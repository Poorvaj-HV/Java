import java.lang.Math;

public class P1 {
    public static int kadanes(int arr[]) {
        int n = arr.length;
        int cs = 0;
        
        int maxSum = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        //if all elements are negative
        for(int j=0; j<n; j++) {
            if(arr[j] < 0) {
                max = Math.max(arr[j], max);
            }
        }

        for(int i=0; i<n; i++) {
            cs += arr[i];
            if(cs < 0) {
                cs = 0;
            }
            maxSum = Math.max(cs, maxSum);
        }

        if(maxSum == 0) {
            return max;
        } else {
            return maxSum;
        }
    }

    public static void main(String[] args) {
        int arr[] = {-2, -4, -6, 8, -10};
        System.out.println(kadanes(arr));
    }
}