package Assignment2;

import java.util.Scanner;

public class PatternTriangle {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
//		int n = 4;//total number of rows
		if(n>0 && n<10) {
			int nst = 1;// total number of entries in 1st row
			int nsp = n-1;
			int row = 1;
			int count = 1;
			while(row<=n) {
				int csp = 1;
				while(csp<=nsp) {
					System.out.print(" ");
					csp++;
				}
				int cst = 1;
				while(cst<=nst) {
					if(cst<row) {
						System.out.print(count);
						count++;
					}
					else {
						System.out.print(count);
						count--;
					}
					cst++;
				}
				row++;
				nsp--;
				nst = nst + 2;
				count = count + 2;
				System.out.println();
			}
		}
	}
}
