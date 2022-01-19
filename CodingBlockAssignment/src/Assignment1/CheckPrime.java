package Assignment1;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		int n;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n>2 && n<=1000000000) {
			if(n==2 || n==3) {
				flag = true;
			}
			for(int i =2;i<=n/2;i++) {
				if(n%i == 0) {
					flag = false;
				}
			}
			if(flag != false) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Not Prime");
			}
		}
	}
}
