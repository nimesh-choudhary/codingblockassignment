package Assignment2;

import java.util.Scanner;

public class PatternLader {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int row = 1;
		int nst = 1;
		int count = 1;
		while(row<=n) {
			int cst = 1;	
			while(cst<=nst) {
				System.out.print(count+"    ");
				cst++;
				count++;
			}
			row++;
			nst++;
			System.out.println();
		}
	}
}
