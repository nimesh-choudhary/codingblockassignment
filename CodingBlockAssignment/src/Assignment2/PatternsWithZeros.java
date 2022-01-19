package Assignment2;

import java.util.Scanner;

public class PatternsWithZeros {
	public static void main(String[] args) {
//		int n = 5;
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int count = 1;
		int nst = 1;
		int row = 1;
//		int count = 1;
		while(row<=n) {
			int cst = 1;
			while(cst<=nst) {
				if(cst == 1 || cst == row)
					System.out.print(count+"    ");
				else
					System.out.print("0"+"    ");
				cst++;
			}
			count++;
			nst++;			
			row++;
			System.out.println();
		}
	}
}
