package Assignment2;

import java.util.Scanner;

public class MirrorStarPattern {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n>0 && n<10){
			if(n%2 != 0) {
//				int n = 5;//total number of rows
				int nst = 1;// total number of stars in 1st row
				int nsp = n/2;// total number of spaces in 1st row
				int row = 1;
				while(row<=n) {
					int csp = 1;
					while(csp<=nsp) {
						System.out.print(" "+"    ");
						csp++;
					}
					int cst = 1;
					while(cst<=nst) {
						System.out.print("*"+"    ");
						cst++;
					}
					row++;
					System.out.println();
					if(row<=n/2 + 1) {
						nsp--;
						nst = nst + 2;
					}else {
						nsp++;
						nst = nst - 2;
					}
				}
			}
		}
	}
}
