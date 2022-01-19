package Assignment1;

import java.util.Scanner;
import java.lang.Math;

public class VonNeumanLovesBinary {
	public static int numDigits(int n) {
		int count = 0;
		while(n!=0) {
			n = n/10;
			count = count + 1;
		}
		
		return count;
	}
	public static void main(String[] args) {
		int n,q;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter querry");
		q = sc.nextInt();
		if(q<=1000) {
			while(q!=0) {
				System.out.println("Enter number");
				n = sc.nextInt();
				if(numDigits(n)<=16) {
					int i = 0;
					int decimal = 0; 
					int size = numDigits(n);
					while(i<size) {
						int d = n%10;
						decimal = decimal + (int)Math.pow(2,i)*d;
						i++;
						n = n/10;
					}
				System.out.println("Decimal number -> "+decimal);
				q--;
				}
			}
		}
	}
}
