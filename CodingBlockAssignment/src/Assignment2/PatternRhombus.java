package Assignment2;

import java.util.Scanner;

public class PatternRhombus {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
//		if(n>0 && n<10) {
			int nst = 1;
			int nsp = n-1;
			int row = 1;
			int count = 1;
			while(row <= 2*n - 1) {
				int csp = 1;
				while(csp<=nsp) {
					System.out.print(" "+"\t");
					csp++;
				}
				int cst = 1;
				while(cst<=nst) {
					if(cst< nst/2 + 1) {
						System.out.print(count+"\t");
						count++;
					}else {
						System.out.print(count+"\t");
						count--;
					}
					cst++;
				}
				row++;
				System.out.println();
				if(row>n) {
					nst = nst - 2;
					nsp++;
//					count--;
				}
				else {
					nst = nst + 2;
					nsp--;
					count = count + 2;
				}
			}
//		}
	}
}
