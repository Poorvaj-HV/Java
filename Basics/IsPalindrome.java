import java.util.*;
class IsPalindrome {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = n;
        int n2 = 0, r = 0;
        
        //getting reverse of n1
        while(n1 != 0) {
            n2 = (n2 + r) * 10;
            r = n1 % 10;
            n1 = n1 / 10;
        }
        
        n2 = n2 + r;
        
        boolean isPalindrome = true;
        
        //checking if n is a palindrome or not
        //comparing digits of n and n2
        while(n != 0 || n2 != 0) {
            int r1 = n % 10;
            int r2 = n2 % 10;
            
            if(r1 != r2) {
                isPalindrome = false;
                break;
            }
            n = n / 10;
            n2 = n2 / 10;
        }
        
        System.out.println(isPalindrome);
    }
}
