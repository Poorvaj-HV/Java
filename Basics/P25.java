class P25 {
public static void main(String[] args) {
int n=5;
int y=n-1;

for(int i=1; i<=n; i++) {
for(int j=1; j<=i-1; j++) {
System.out.print(j);
}
for(int k=1; k<=(n-i + n-i + 1); k++) {
System.out.print(i);
}
for(int j=i-1; j>=1; j--) {
System.out.print(j);
}
System.out.println();
}

for(int i=1; i<=n-1; i++) {
for(int j=1; j<=n-i; j++) {
System.out.print(j);
}
for(int k=1; k<=(i+i-1); k++) {
System.out.print(y);
}
y--;
for(int j=n-i; j>=1; j--) {
System.out.print(j);
}
System.out.println();
}

}
}