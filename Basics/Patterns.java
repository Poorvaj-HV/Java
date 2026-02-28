import java.util.*;

class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
	  System.out.println("Pattern 1 : Right Angled triangle");
 	  System.out.println();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                
		         System.out.print("* ");
            }
            System.out.println();
        }


	  System.out.println();
	  System.out.println("Pattern 2 : Inverted right angled triangle");
 	  System.out.println();

	  for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
		         System.out.print("* ");
            }
            System.out.println();
        }


	  System.out.println();
	  System.out.println("Pattern 3 : Full Pyramid");
 	  System.out.println();

	  for(int i=1; i<=n; i++) {
		for(int j=1; j<=n-i; j++) {
		    System.out.print("  ");
		}
            for(int j=1; j<=(i+i)-1; j++) {
		     System.out.print("* ");
            }
            System.out.println();
        }


	  System.out.println();
	  System.out.println("Pattern 4 : Inverted Full Pyramid");
 	  System.out.println();

	  for(int i=1; i<=n; i++) {
		for(int j=1; j<=i-1; j++) {
		    System.out.print("  ");
		}
            for(int j=1; j<=(n-i + n-i)+1; j++) {
		     System.out.print("* ");
            }
            System.out.println();
        }


	  System.out.println();
	  System.out.println("Pattern 5 : Boundary Diamond");
 	  System.out.println();

	  for(int i=1; i<=(n+n)-1; i++) {
            for(int j=1; j<=(n+n)-1; j++) {
		     if((i+j == n+1) || (i+n-1 == j) || (i == j+n-1) || i+j == n+n+n-1){
		         System.out.print("* ");
		     } else {
		         System.out.print("  ");
		     }
            }
            System.out.println();
        }


	  System.out.println();
	  System.out.println("Pattern 6 : Hollow Square");
 	  System.out.println();

	  for(int i=1; i<=n; i++) {
	  	for(int j=1; j<=n; j++) {
		    if(i == 1 || j == 1 || i == n | j == n) {
		        System.out.print("* ");
		    } else {
		    	  System.out.print("  ");
		    }
		}
            System.out.println();
        }


	  System.out.println();
        System.out.println("Pattern 7 : Hollow Pyramid");
 	  System.out.println();

	  for(int i=1; i<=n; i++) {
	  	for(int j=1; j<=n+n-1; j++) {
		    if((i+j == n+1) || (i+n-1 == j) || i == n) {
		        System.out.print("* ");
		    } else {
		    	  System.out.print("  ");
		    }
		}
            System.out.println();
        }


	  System.out.println();
	  System.out.println("Pattern 8 : Pascal's Triangle");
 	  System.out.println();

	  for(int i=1; i<=n; i++) {
		for(int j=1; j<=n-i; j++) {
		    System.out.print(" ");
		}
	  	for(int j=1; j<=i; j++) {
		    System.out.print("* ");
		}
            System.out.println();
        }

	  System.out.println();
	  System.out.println("Pattern 9 : Diamond");
 	  System.out.println();

	  for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
		     System.out.print("  ");
            }
		  for(int j=1; j<=(i+i-1); j++) {
		     System.out.print("* ");
            }
            System.out.println();
        }

	   for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
		     System.out.print("  ");
            }
		  for(int j=1; j<=(n-i+n-i-1); j++) {
		     System.out.print("* ");
            }
            System.out.println();
        }
    }
}