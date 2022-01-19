package Assignment2;
import java.util.*;
public class MagicPattern {
    public static void main (String args[]) {
        int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int d = 2*N;
		int n = d - 1;
		int row =1;
		int nst = n/2+1;
		int nsp = -1;

		while (row <= n) {
			int cst1 = 1;
			while (cst1 <= nst) {
				System.out.print("*");
				cst1++;
			}

			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			int cst2 = 1;
			if(row==1||row==n) {
				cst2=2;
			}
			while (cst2 <= nst) {
				System.out.print("*");
				cst2++;
			}

			row++;
			System.out.println();
			if (row > n / 2 + 1) {
				nsp=nsp-2;
				nst++;
			} else {
				nsp=nsp+2;
				nst--;
			}
		}
    }
}