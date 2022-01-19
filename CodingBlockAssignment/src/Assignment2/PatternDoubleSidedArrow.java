package Assignment2;

import java.util.Scanner;

public class PatternDoubleSidedArrow {
	public static void main(String[] args) {
//		int n = 9;
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n%2!=0) {
			int nst = 1;
			int nsp2 = -1;
			int row = 1;
			int nsp1 = n-1;
			int count;
			while(row<=n) {
				int csp = 1;
				while(csp<=nsp1) {
					System.out.print(" ");
					csp++;
				}
				if(row>n/2 + 1) {
					count = n - row + 1;
				}
				else if(row == n) {
					count = 1;
				}
				else {
					count = row;
				}
				int cst = 1;
				while(cst<=nst) {
					System.out.print(count);
					cst++;
					count--;
				}
				int csp2 = 1;
				while(csp2<=nsp2) {
					System.out.print(" ");
					csp2++;
				}
				int cst2 = 1;
				while(cst2<=nst) {
					if(row==1 || row == n) {
						System.out.print("");
					}
					else {
						System.out.print(cst2);
					}
					cst2++;
				}
				row++;
				System.out.println();
				if(row>n/2+1) {
					nsp2 = nsp2 - 2;
					nst--;
					nsp1 = nsp1 + 2;
				}
				else {
					nsp2 = nsp2 + 2;
					nst++;
					nsp1 = nsp1 - 2;
				}
			}
		}		
	}
}
