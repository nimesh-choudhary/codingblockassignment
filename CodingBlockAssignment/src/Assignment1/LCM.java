package Assignment1;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		int n1, n2;
		int gcd = 1;
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		if(n1>0 && n1<1000000000) {
			n2 = sc.nextInt();
			if(n2>0 && n2<1000000000) {
				if(n1 == 1 || n2 == 1) {
					gcd = 1;
				}
				else {
					for(int i =2; i<=n1 && i<=n2; i++) {
						if(n1%i == 0 && n2%i == 0) {
							gcd = i;
							System.out.println("GCD is "+gcd);
						}
					}
				}
				System.out.println("GCD is "+gcd);
				int lcm = (n1*n2)/gcd;
				System.out.println("lCM is"+lcm);
			}
		}
	}
}
