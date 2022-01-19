package Assignment2;

import java.util.Scanner;

public class FibnocciPattern {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int row = 1;
		int nst = 1;
		int num1 = 0, num2 = 1;
		while(row<=n) {
			int cst = 1;
			while(cst<=nst) {
				System.out.print(num1+"\t");
				cst++;
				int num3 = num2 + num1;
				num1 = num2;
				num2 = num3;
			}
			row++;
			nst++;
			System.out.println();
		}
		
	}
}
