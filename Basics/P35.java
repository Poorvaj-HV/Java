class P35 {
public static void main(String[] args) {
int n=9;

for(int i=1; i<=n; i++) {
for(int j=1; j<=n; j++) {
if(i+j+4 == n+1 || i == j+4 || i == j-4 || i+j == n+1+4) {
System.out.print("*");
} else {
System.out.print(" ");
}
}
System.out.println();

}
}
}