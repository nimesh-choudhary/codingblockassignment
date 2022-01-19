package Assignment1;

import java.util.Scanner;

public class PrintSeries {
	public static void main(String[] args) {
		int N1, N2;
//		int output = 0;
//		int n = 1;
//		int count = 1;
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter N1");
		N1 = sc.nextInt();
//		System.out.println("Enter N2");
		N2 = sc.nextInt();
		if(N1>0 && N1<100) {
			if(N2>0 && N2<100) {
				int output = 0;
				int n = 1;
				int count = 1;
				while(count<=N1) {
					output = 3*n + 2;
					if(output%N2 != 0) {
						System.out.println(output);
						count = count + 1;
					}
//					System.out.println("");
					n = n+1;
				}
			}
			else {
				System.out.println("Invalid Input");
			}
		}
		else {
			System.out.println("Invalid Input");
		}
	}
}
