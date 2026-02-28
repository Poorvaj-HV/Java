class P242 {
public static void main(String[] args) {
int n=9;

for(int i=1; i<=n/2+1; i++) {
for(int j=1; j<=n; j++) {
if(i==j || ((i+j)%2==0 && i == 1) || i+j == n+1) {
System.out.print("*");
} else {
System.out.print(" ");
}
}
System.out.println();

}
}
}