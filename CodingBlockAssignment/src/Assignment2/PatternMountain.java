package Assignment2;

import java.util.Scanner;

public class PatternMountain {
	public static void main(String[] args) {
//		int n = 5;
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int d = 2*(n-1);
		int nsp = d - 1; 
		int nst = 1;
		int row = 1;
		int count = 1;
//		System.out.println(nsp);
		while(row<=n) {
			int cst = 1;
			while(cst<=nst) {
				System.out.print(cst+"\t");
				cst++;
			} 
			cst--;
			if(cst == n) {
				cst--;
			}
			int csp = 1;
			while(csp<=nsp) {
				System.out.print(" "+"\t");
				csp++;
			}
			int cst2 = cst;
			while(cst2>0) {
				System.out.print(cst2+"\t");
				cst2--;
			}
			nst++;
			nsp = nsp - 2;
			row++;
			count++;
			System.out.println();
		}
	}
}
