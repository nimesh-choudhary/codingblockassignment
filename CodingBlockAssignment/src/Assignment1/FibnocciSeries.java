package Assignment1;

import java.util.Scanner;

public class FibnocciSeries {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		if(N>=0 && N<=1000) {
			int n3 = 0;
			for(int i = 2; i<=N; i++) {
				n3 = n1+n2;
				System.out.println(n3);
				n1 = n2;
				n2 = n3;
			}
//			System.out.println(n3);
		}
	}
}
