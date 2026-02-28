class P23 {
public static void main(String[] args) {
int n=5;
int y;

for(int i=1; i<=n; i++) {
y=i;
for(int j=1; j<=n-i; j++) {
System.out.print(" ");
}
for(int k=1; k<=i; k++) {
System.out.print(y);
y--;
}

y+=2;
for(int l=1; l<=i-1; l++) {
System.out.print(y);
y++;
}

System.out.println();
}

}
}