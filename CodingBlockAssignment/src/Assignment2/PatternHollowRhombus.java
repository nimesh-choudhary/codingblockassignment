package Assignment2;

import java.util.Scanner;

public class PatternHollowRhombus {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int row = 1;
		int nst = n;
		int nsp = n - 1;
		if(n<=20) {
			while(row<=n) {
				int csp = 1;
				while(csp<=nsp) {
					System.out.print(" ");
					csp++;
				}
				int cst = 1;
				while(cst<=nst) {
					if(row == 1 || row == n || cst == 1 || cst == nst) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					cst++;
				}
				row++;
				nsp--;
				System.out.println();
			}
		}
	}
}
