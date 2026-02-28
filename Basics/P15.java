class P15 {
public static void main(String[] args) {
int n=5;
for(int i=n; i>=1; i--) {
for(int k=i; k<=n-1; k++) {
System.out.print(" ");
}
for(int j=1; j<=(i+i-1); j++) {
System.out.print("*");
}
System.out.println();
}
}
}