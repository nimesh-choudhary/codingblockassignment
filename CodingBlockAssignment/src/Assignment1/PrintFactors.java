package Assignment1;

import java.util.Scanner;

public class PrintFactors {
	public static void main(String[] args) {
		int n;
		Scanner sc =  new Scanner(System.in);
		n = sc.nextInt();
		int i = 1;
		int a;
		while(n!=0 && i<=n) {
			if(n%i==0) {
				n = n/i;
				System.out.println(n);
				
			}
			else {
				i++;
			}
		}
	}
}
