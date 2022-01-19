package Assignment1;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		int n;
		int d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		n = sc.nextInt();
		if(n>=0 && n<=1000000000) {
			System.out.println("Enter digit want to check");
			d = sc.nextInt();
			if(d>=0 && d<=9) {
				int count = 0;
				while(n!=0) {
					int a = n%10;
					if(a == d) {
						count = count + 1;
					}
					n = n/10;
				}
				System.out.println("The number of times"+d+"is "+count);
			}
			else {
				System.out.println("Invalid input");
			}
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
