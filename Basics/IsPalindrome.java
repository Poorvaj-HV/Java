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
        
        System.out.println((n == n2) ? "Its a palindrome" : "Its not a palindrome");
    }
}
