import java.util.*;
class PrimeDigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        while(n != 0) {
            int r = n % 10;
            int count = 0;
            for(int i=1; i<=r; i++) {
                if(r % i == 0) {
                    count++;
                }
            }
            if(count == 2) {
                sum += r;
            }
            n = n / 10;
        }
        
        System.out.println("Sum : "+sum);
    }
}
