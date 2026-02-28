class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0, r = 0;
        System.out.println("Before : "+n);

        while(n != 0) {
            num = (num + r) * 10;
            r = n % 10;
            n = n / 10;
        }
        
        num = num + r;
        
        System.out.println("After : "+num);
    }
}
